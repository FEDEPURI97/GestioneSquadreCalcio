package com.puricellafederico.my_app_calcio.service;

import com.puricellafederico.my_app_calcio.Dao.PlayerRepository;
import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerResponse;
import com.puricellafederico.my_app_calcio.eccezzionicontrollate.ExceptionGicoatore;
import com.puricellafederico.my_app_calcio.mapper.Mapper;
import com.puricellafederico.my_app_calcio.model.PlayerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository dao;

    @Autowired
    private Mapper mapper;

    @Transactional(readOnly = true)
    public List<PlayerResponse> getPlayerForTeam(String nameTeam) {
        return getPlayerResponses(dao.findByTeam_Name(nameTeam));
    }

    @Transactional(readOnly = true)
    public List<PlayerResponse> getPlayerForRole(String role) {
        return getPlayerResponses(dao.findByRole(role));
    }

    @Transactional(readOnly = true)
    public List<PlayerResponse> getPlayerForMinPay(Integer minPay) {
        return getPlayerResponses(dao.findBySalaryLessThanEqual(minPay));
    }

    @Transactional(readOnly = true)
    public List<PlayerResponse> getPlayerForMaxPay(Integer maxPay) {
        return getPlayerResponses(dao.findBySalaryGreaterThanEqual(maxPay));
    }

    @Transactional(readOnly = true)
    public PlayerResponse getPlayerForName(String name , String surname) {
        PlayerModel model = dao.findByNameAndSurname(name , surname).
                orElseThrow(() -> new ExceptionGicoatore("Gicoatore non trovato : " , name , surname));
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
