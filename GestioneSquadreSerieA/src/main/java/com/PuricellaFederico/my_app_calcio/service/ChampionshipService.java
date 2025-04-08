package com.puricellafederico.my_app_calcio.service;

import com.puricellafederico.my_app_calcio.Dao.RepositoryChampionship;
import com.puricellafederico.my_app_calcio.response.championshipResponse.Championship;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipWhitTeam;
import com.puricellafederico.my_app_calcio.response.championshipResponse.TeamChampionship;
import com.puricellafederico.my_app_calcio.eccezzionicontrollate.ExceptionTorneo;
import com.puricellafederico.my_app_calcio.mapper.Mapper;
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
    private RepositoryChampionship dao;

    @Transactional(readOnly = true)
    public ChampionshipInterfaceResponse getChampionship(Boolean team , String championshipName) {
        Optional<ChampionshipModel> modelOptional = dao.findByNameContaining(championshipName);
        ChampionshipModel model = modelOptional.orElseThrow(() -> new ExceptionTorneo("Torneo non trovato" , championshipName));
        if (team){
            ChampionshipWhitTeam response = mapper.toChampionshipWhitTeam(model);
            List<TeamChampionship> teams = new ArrayList<>();
            for(TeamModel teamModel : model.getTeams()){
                teams.add(mapper.toTeamName(teamModel));
            }
            response.setTeamChampionShips(teams);
            return response;
        }
        return mapper.toChampionship(model);
    }

    @Transactional(readOnly = true)
    public List<Championship> getAll() {
        List<Championship> modelList = new ArrayList<>();
        for (ChampionshipModel model : dao.findAll()) {
            modelList.add(mapper.toChampionship(model));
        }
        return modelList;
    }
}
