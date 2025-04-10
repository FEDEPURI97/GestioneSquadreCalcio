package com.puricellafederico.my_app_calcio.service;

import com.puricellafederico.my_app_calcio.Dao.ChampionshipRepository;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipResponse;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipWhitTeamResponse;
import com.puricellafederico.my_app_calcio.response.championshipResponse.TeamChampionshipResponse;
import com.puricellafederico.my_app_calcio.customException.ExceptionTorneo;
import com.puricellafederico.my_app_calcio.factory.Mapper;
import com.puricellafederico.my_app_calcio.model.ChampionshipModel;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipInterfaceResponse;
import com.puricellafederico.my_app_calcio.model.TeamModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChampionshipService {

    @Autowired
    private Mapper mapper;

    @Autowired
    private ChampionshipRepository dao;

    @Transactional(readOnly = true)
    public ChampionshipInterfaceResponse getChampionship(Boolean team , String championshipName) {
        Optional<ChampionshipModel> modelOptional = dao.findByNameContainingIgnoreCase(championshipName);
        ChampionshipModel model = modelOptional.orElseThrow(() -> new ExceptionTorneo("Torneo non trovato" , championshipName));
        if (team){
            ChampionshipWhitTeamResponse response = mapper.toChampionshipWhitTeam(model);
            List<TeamChampionshipResponse> teams = new ArrayList<>();
            for(TeamModel teamModel : model.getTeams()){
                teams.add(mapper.toTeamName(teamModel));
            }
            response.setTeamChampionShips(teams);
            return response;
        }
        return mapper.toChampionship(model);
    }

    @Transactional(readOnly = true)
    public List<ChampionshipResponse> getAll() {
        List<ChampionshipResponse> modelList = new ArrayList<>();
        for (ChampionshipModel model : dao.findAll()) {
            modelList.add(mapper.toChampionship(model));
        }
        return modelList;
    }
}
