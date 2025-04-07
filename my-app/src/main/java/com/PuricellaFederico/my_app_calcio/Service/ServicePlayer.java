package com.PuricellaFederico.my_app_calcio.Service;

import com.PuricellaFederico.my_app_calcio.Dto.PlayerResponse.PlayerResponse;
import com.PuricellaFederico.my_app_calcio.EccezzioniControllate.GicoatoreException;
import com.PuricellaFederico.my_app_calcio.Mapper.Mapper;
import com.PuricellaFederico.my_app_calcio.Model.PlayerModel;
import com.PuricellaFederico.my_app_calcio.Dao.DaoImplement.DaoPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicePlayer {

    @Autowired
    DaoPlayer dao;

    @Autowired
    Mapper mapper;

    @Transactional(readOnly = true)
    public List<PlayerResponse> getPlayerForTeam(String nameTeam) {
        return getPlayerResponses(dao.getPlayerForTeam(nameTeam));
    }

    @Transactional(readOnly = true)
    public List<PlayerResponse> getPlayerForRole(String role) {
        return getPlayerResponses(dao.getPlayerForRole(role));
    }

    @Transactional(readOnly = true)
    public List<PlayerResponse> getPlayerForMinPay(Integer minPay) {
        return getPlayerResponses(dao.getForMinSalary(minPay));
    }

    @Transactional(readOnly = true)
    public List<PlayerResponse> getPlayerForMaxPay(Integer maxPay) {
        return getPlayerResponses(dao.getForMaxSalary(maxPay));
    }

    @Transactional(readOnly = true)
    public PlayerResponse getPlayerForName(String name , String surname) {
        PlayerModel model = dao.getGetPlayerForNameSurname(name , surname).
                orElseThrow(() -> new GicoatoreException("Gicoatore non trovato : " , name , surname));
        return mapper.toPlayerResponse(model);
    }

    private List<PlayerResponse> getPlayerResponses(List<PlayerModel> list) {
        List<PlayerResponse> responseList = new ArrayList<>();
        for (PlayerModel playerModel : list) {
            PlayerResponse response = mapper.toPlayerResponse(playerModel);
            response.setTeamChampionship(mapper.toTeamName(playerModel.getTeam()));
            responseList.add(response);
        }
        return responseList;
    }
}
