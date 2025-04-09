package com.puricellafederico.my_app_calcio.service;

import com.puricellafederico.my_app_calcio.Dao.PlayerRepository;
import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerResponse;
import com.puricellafederico.my_app_calcio.customException.ExceptionGicoatore;
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
        return getPlayerListResponses(dao.findByTeam_NameIgnoreCase(nameTeam));
    }

    @Transactional(readOnly = true)
    public List<PlayerResponse> getPlayerForRole(String role) {
        return getPlayerListResponses(dao.findByRoleIgnoreCase(role));
    }

    @Transactional(readOnly = true)
    public List<PlayerResponse> getPlayerForMinPay(Integer minPay) {
        return getPlayerListResponses(dao.findBySalaryGreaterThanEqual(minPay));
    }

    @Transactional(readOnly = true)
    public List<PlayerResponse> getPlayerForMaxPay(Integer maxPay) {
        return getPlayerListResponses(dao.findBySalaryLessThanEqual(maxPay));
    }

    @Transactional(readOnly = true)
    public PlayerResponse getPlayerForName(String name , String surname) {
        PlayerModel model = dao.findByNameAndSurnameIgnoreCase(name , surname).
                orElseThrow(() -> new ExceptionGicoatore("Gicoatore non trovato : " , name , surname));
          return getPlayerResponse(model);
    }

    @Transactional(readOnly = true)
    private List<PlayerResponse> getPlayerListResponses(List<PlayerModel> list) {
        List<PlayerResponse> responseList = new ArrayList<>();
        for (PlayerModel playerModel : list) {
            PlayerResponse response = getPlayerResponse(playerModel);
            responseList.add(response);
        }
        return responseList;
    }

    @Transactional(readOnly = true)
    private PlayerResponse getPlayerResponse(PlayerModel playerModel) {
        PlayerResponse response = mapper.toPlayerResponse(playerModel);
        response.setTeamChampionship(mapper.toTeamName(playerModel.getTeam()));
        return response;
    }
}
