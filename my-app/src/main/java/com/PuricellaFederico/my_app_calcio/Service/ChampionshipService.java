package com.PuricellaFederico.my_app_calcio.Service;

import com.PuricellaFederico.my_app_calcio.Dao.ChampionshipRepository;
import com.PuricellaFederico.my_app_calcio.Dto.ChampionshipResponse.Championship;
import com.PuricellaFederico.my_app_calcio.Dto.ChampionshipResponse.ChampionshipWhitTeam;
import com.PuricellaFederico.my_app_calcio.Dto.ChampionshipResponse.TeamChampionship;
import com.PuricellaFederico.my_app_calcio.EccezzioniControllate.TorneoException;
import com.PuricellaFederico.my_app_calcio.Mapper.Mapper;
import com.PuricellaFederico.my_app_calcio.Model.ChampionshipModel;
import com.PuricellaFederico.my_app_calcio.Dto.ChampionshipResponse.ChampionshipInterfaceResponse;
import com.PuricellaFederico.my_app_calcio.Model.TeamModel;
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
        Optional<ChampionshipModel> modelOptional = dao.findByNameContaining(championshipName);
        ChampionshipModel model = modelOptional.orElseThrow(() -> new TorneoException("Torneo non trovato" , championshipName));
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
