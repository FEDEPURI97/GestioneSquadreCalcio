package com.puricellafederico.my_app_calcio.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.puricellafederico.my_app_calcio.Dao.TeamRepository;
import com.puricellafederico.my_app_calcio.dto.DatePlayerForAnalistDto;
import com.puricellafederico.my_app_calcio.dto.DateStoricTrasferimentDto;
import com.puricellafederico.my_app_calcio.dto.DateTrasferimentDto;
import com.puricellafederico.my_app_calcio.factory.VelocityFactory;
import com.puricellafederico.my_app_calcio.model.DateTrasferimentModel;
import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerForTeamResponse;
import com.puricellafederico.my_app_calcio.customException.ExceptionSquadra;
import com.puricellafederico.my_app_calcio.factory.Mapper;
import com.puricellafederico.my_app_calcio.model.PlayerModel;
import com.puricellafederico.my_app_calcio.model.TeamModel;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamPlayerResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamStaticsResponse;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.validation.constraints.NotBlank;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository dao;

    @Autowired
    private Mapper mapper;

    @Autowired
    private Template template;

    @Autowired
    private VelocityFactory velocityFactory;

    @Autowired
    private VelocityEngine velocityEngine;

    @Autowired
    private RestTemplate restTemplate;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void updateTeam(String name, String outCome) {
        TeamModel model = dao.findByNameContainingIgnoreCase(name).orElseThrow(() -> new ExceptionSquadra("Impossibile aggiornare squadra non trovata"));
        if (outCome.equalsIgnoreCase("WIN")){
            model.setWin(model.getWin() + 1);
        } else if (outCome.equalsIgnoreCase("LOSE")) {
            model.setWin(model.getWin() + 1);
        }else if(outCome.equalsIgnoreCase("DRAW")) {
            model.setDraw(model.getDraw() + 1);
        }
    }

    @Transactional(readOnly = true)
    public List<TeamResponse> getAllTeam() {
        return getTeamResponses(dao.findAll());
    }

    @Transactional(readOnly = true)
    public TeamPlayerResponse getTeamForName(String name) {
        TeamModel model = dao.findByNameContainingIgnoreCase(name).
                orElseThrow(() -> new ExceptionSquadra("Squadra nome non trovato"));
        TeamPlayerResponse response = mapper.toTeamPlayerResponse(model);
        response.setResponsePlayerList(getPlayerResponse(model.getPlayerModel()));
        return response;
    }

    @Transactional(readOnly = true)
    public List<TeamResponse> getTeamMinBudget(Integer minBudget) {
        return getTeamResponses(dao.findByBudgetYearGreaterThanEqual(minBudget).
            orElseThrow(() -> new ExceptionSquadra("Budget errato")));
    }

    @Transactional(readOnly = true)
    public List<TeamResponse> getTeamMaxBudget(Integer maxBudget) {
        return getTeamResponses(dao.findByBudgetYearLessThanEqual(maxBudget).
                orElseThrow(() -> new ExceptionSquadra("Budget errato")));
    }

    @Transactional(readOnly = true)
    public TeamResponse getTeamForPosition(Integer position) {
        List<TeamStaticsResponse> listTeam = new ArrayList<>();
        List<TeamModel> modelList = dao.findAll();
        for (TeamModel teamModel : modelList) {
            TeamStaticsResponse response = mapper.toTeamStaticsResponse(teamModel);
            listTeam.add(response);
        }
        String name = teamOrderPosition(listTeam).get(position-1).getName();
        return checkTeamName(name , modelList);
    }

    @Transactional(readOnly = true)
    public InputStream getTeamDiagram(@NotBlank(message = "Error name not null") String name) {
        TeamModel model = dao.findByNameContainingIgnoreCase(name).
                orElseThrow(() -> new ExceptionSquadra("Squadra nome non trovato"));
        VelocityContext context = velocityFactory.getContext(model);
        Writer writer = new StringWriter();
        template.merge(context, writer);
        File tempFile = null;
        try {
            tempFile = File.createTempFile("team-diagram-", ".puml");
            try (FileWriter fileWriter = new FileWriter(tempFile)) {
                fileWriter.write(writer.toString());
            }
            return new FileInputStream(tempFile);
        } catch (IOException e) {
            throw new RuntimeException("Errore nella generazione del diagramma", e);
        } finally {
            if (tempFile != null && tempFile.exists()) {
                tempFile.deleteOnExit();
            }
        }
    }

    @Transactional(readOnly = true)
    public String getPredictPlayer(String nameTeam , String namePlayerBuy , String surnamePlayerBuy) throws JsonProcessingException {
        String url = "http://localhost:5000/requestPrediction";
        String sql = "SELECT d FROM DateTrasferimentModel d";
        List<DateTrasferimentModel> listDateModel = entityManager.createQuery(sql , DateTrasferimentModel.class).getResultList();
        List<DateStoricTrasferimentDto> listDateTrasferiment = new ArrayList<>();
        for (DateTrasferimentModel dateTrasferimentModel : listDateModel) {
            listDateTrasferiment.add(mapper.toDateStoricTrasferiment(dateTrasferimentModel));
        }
        sql = "SELECT s.budgetYear FROM squadre s WHERE s.name LIKE :name";
        Integer budgetTeamBuy = entityManager.createQuery(sql , Integer.class)
                .setParameter("name" , nameTeam.concat("%"))
                .getSingleResult();
        sql = "SELECT new com.puricellafederico.my_app_calcio.dto.DatePlayerForAnalistDto(p.salary, t.budgetYear)" +
               "FROM giocatori p JOIN p.team t WHERE p.name LIKE :name AND p.surname LIKE :surname";
        DatePlayerForAnalistDto datePlayer = entityManager.createQuery(sql , DatePlayerForAnalistDto.class).
                setParameter("name" , namePlayerBuy.concat("%")).
                setParameter("surname" , surnamePlayerBuy.concat("%")).getSingleResult();
        DateTrasferimentDto dateInput = mapper.toDateTrasferimentDto(listDateTrasferiment , budgetTeamBuy , datePlayer);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<DateTrasferimentDto> request = new HttpEntity<>(dateInput, headers);
        ResponseEntity<Integer> response = restTemplate.postForEntity(url , request, Integer.class);
        return null;
    }


    private TeamResponse checkTeamName(String name, List<TeamModel> modelList) {
        for (TeamModel teamModel : modelList) {
            if (teamModel.getName().equalsIgnoreCase(name)){
                return mapper.toTeamResponse(teamModel);
            }
        }
        throw new RuntimeException("Errore logico");
    }


    private List<TeamStaticsResponse> teamOrderPosition(List<TeamStaticsResponse> listTeam) {
        for (TeamStaticsResponse response : listTeam) {
            response.setPoint();
        }
        listTeam.sort(Comparator.comparing(TeamStaticsResponse::getPoint).reversed());
        return listTeam;
    }


    public TeamStaticsResponse getStaticsTeam(String name) {
        TeamStaticsResponse response = mapper.toTeamStaticsResponse(dao.findByNameContainingIgnoreCase(name).
                orElseThrow(() -> new ExceptionSquadra("Squadra non trovata")));
        response.setPoint();
        return response;
    }


    private List<TeamResponse> getTeamResponses(List<TeamModel> teamModelList) {
        List<TeamResponse> responseList = new ArrayList<>();
        for (TeamModel teamModel : teamModelList) {
            TeamResponse response = mapper.toTeamResponse(teamModel);
            responseList.add(response);
        }
        return responseList;
    }


    private List<PlayerForTeamResponse> getPlayerResponse(List<PlayerModel> playerModel) {
        List<PlayerForTeamResponse> responsePlayer = new ArrayList<>();
        for (PlayerModel model : playerModel) {
            responsePlayer.add(mapper.toPlayerForTeamResponse(model));
        }
        return responsePlayer;
    }

}
