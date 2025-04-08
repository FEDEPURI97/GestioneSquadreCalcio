package com.puricellafederico.my_app_calcio.service;

import com.puricellafederico.my_app_calcio.Dao.TeamRepository;
import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerForTeamResponse;
import com.puricellafederico.my_app_calcio.customException.ExceptionSquadra;
import com.puricellafederico.my_app_calcio.mapper.Mapper;
import com.puricellafederico.my_app_calcio.model.PlayerModel;
import com.puricellafederico.my_app_calcio.model.TeamModel;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamStaticsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository dao;

    @Autowired
    private Mapper mapper;

    public void updateTeam(String name, String outCome) {
        TeamModel model = dao.findByNameContaining(name).orElseThrow(() -> new ExceptionSquadra("Impossibile aggiornare squadra non trovata"));
        if (outCome.equalsIgnoreCase("WIN")){
            model.setWin(model.getWin() + 1);
        } else if (outCome.equalsIgnoreCase("LOSE")) {
            model.setWin(model.getWin() + 1);
        }else if(outCome.equalsIgnoreCase("DRAW")){
            throw new ExceptionSquadra("Esito non valido");
        }
        model.setDraw(model.getDraw() + 1);
    }

    public List<TeamResponse> getAllTeam() {
        return getTeamResponses(dao.findAll());
    }

    public TeamResponse getTeamForName(String name) {
        return mapper.toTeamResponse(dao.findByNameContaining(name).
                orElseThrow(() -> new ExceptionSquadra("Squadra nome non trovato")));
    }

    public List<TeamResponse> getTeamMinBudget(Integer minBudget) {
        return getTeamResponses(dao.findByBudgetYearLessThanEqual(minBudget).
            orElseThrow(() -> new ExceptionSquadra("Budget errato")));
    }

    public List<TeamResponse> getTeamMaxBudget(Integer maxBudget) {
        return getTeamResponses(dao.findByBudgetYearGreaterThanEqual(maxBudget).
                orElseThrow(() -> new ExceptionSquadra("Budget errato")));
    }

    public TeamResponse getTeamForPosition(Integer position) {
        List<TeamStaticsResponse> listTeam = new ArrayList<>();
        List<TeamModel> modelList = dao.findAll();
        for (TeamModel teamModel : modelList) {
            TeamStaticsResponse response = mapper.toTeamStaticsResponse(teamModel);
            listTeam.add(response);
        }
        String name = teamOrderPosition(listTeam).get(position).getName();
        return checkTeamName(name , modelList);
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
        TeamStaticsResponse response = mapper.toTeamStaticsResponse(dao.findByNameContaining(name).
                orElseThrow(() -> new ExceptionSquadra("Squadra non trovata")));
        response.setPoint();
        return response;
    }

    private List<TeamResponse> getTeamResponses(List<TeamModel> teamModelList) {
        List<TeamResponse> responseList = new ArrayList<>();
        for (TeamModel teamModel : teamModelList) {
            TeamResponse response = mapper.toTeamResponse(teamModel);
            response.setResponsePlayerList(getPlayerResponse(teamModel.getPlayerModel()));
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
