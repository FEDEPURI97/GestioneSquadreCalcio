package com.puricellafederico.my_app_calcio.controller;

import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerResponse;
import com.puricellafederico.my_app_calcio.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Giocatore", produces = {MediaType.APPLICATION_JSON_VALUE, "application/json"})
public class ControllerPlayer {

    @Autowired
    PlayerService servicePlayer;

    @GetMapping("/{squadraName}")// ritorno tutti i giocatori del campionato tramite squadra
    public ResponseEntity<List<PlayerResponse>> getListPlayerForTeam(String nameTeam){
        return ResponseEntity.status(500).body(servicePlayer.getPlayerForTeam(nameTeam));
    }

    @GetMapping("/{role}")// ritorno tutti i giocatori del campionato tramite ruolo
    public ResponseEntity<List<PlayerResponse>> getListPlayerForRole(String role){
        return ResponseEntity.status(500).body(servicePlayer.getPlayerForRole(role));
    }

    @GetMapping("/{minPay}")// ritorno tutti i giocatori del campionato tramite ruolo
    public ResponseEntity<List<PlayerResponse>> getListPlayerForMinPay(Integer minPay){
        return ResponseEntity.status(500).body(servicePlayer.getPlayerForMinPay(minPay));
    }

    @GetMapping("/{maxPay}")// ritorno tutti i giocatori del campionato tramite ruolo
    public ResponseEntity<List<PlayerResponse>> getListPlayerForMaxPay(Integer maxPay){
        return ResponseEntity.status(500).body(servicePlayer.getPlayerForMaxPay(maxPay));
    }

    @GetMapping("/{name}/{surname}")// ritorno tramite nome cognome
    public ResponseEntity<PlayerResponse> getListPlayerForName(String name , String surname){
        return ResponseEntity.status(500).body(servicePlayer.getPlayerForName(name , surname));
    }



}
