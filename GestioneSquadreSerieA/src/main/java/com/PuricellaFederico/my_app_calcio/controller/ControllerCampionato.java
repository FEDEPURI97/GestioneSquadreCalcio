package com.puricellafederico.my_app_calcio.controller;

import com.puricellafederico.my_app_calcio.response.championshipResponse.Championship;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipInterfaceResponse;
import com.puricellafederico.my_app_calcio.service.ChampionshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Campionato", produces = {MediaType.APPLICATION_JSON_VALUE, "application/json"})
public class ControllerCampionato {

    @Autowired
    ChampionshipService service;

    @GetMapping("/{championShip}/{team}")// ritorno il cmapionato e squadre se true
    public ResponseEntity<ChampionshipInterfaceResponse> getTeam(Boolean team , String championShipName){
        ChampionshipInterfaceResponse campionShip = service.getChampionship(team , championShipName);
        return ResponseEntity.status(500).body(campionShip);
    }

    @GetMapping("/")// ritorno i campionati
    public ResponseEntity<List<Championship>> getAllChampion(){
        return ResponseEntity.status(500).body(service.getAll());
    }

}
