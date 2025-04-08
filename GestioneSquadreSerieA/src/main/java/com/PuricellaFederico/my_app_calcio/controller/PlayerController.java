package com.puricellafederico.my_app_calcio.controller;

import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerResponse;
import com.puricellafederico.my_app_calcio.service.PlayerService;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Giocatore", produces = {MediaType.APPLICATION_JSON_VALUE, "application/json"})
@Validated
public class PlayerController {

    @Autowired
    PlayerService servicePlayer;

    @GetMapping("getPlayerNameTeam/{nameTeam}")// ritorno tutti i giocatori del campionato tramite squadra
    public ResponseEntity<List<PlayerResponse>> getListPlayerForTeam(@PathVariable  @NotBlank(message = "Error name not null") String nameTeam){
        return ResponseEntity.status(HttpStatus.OK).body(servicePlayer.getPlayerForTeam(nameTeam));
    }

    @GetMapping("getPlayerRole/{role}")// ritorno tutti i giocatori del campionato tramite ruolo
    public ResponseEntity<List<PlayerResponse>> getListPlayerForRole(@PathVariable  @Pattern(regexp = "(portiere|attaccante|difensore|centrocampista|)",
                                message = "Error value option is 'portiere' , 'difensore' , 'centrocampista' , attaccante or this value ignore case") String role){
        return ResponseEntity.status(HttpStatus.OK).body(servicePlayer.getPlayerForRole(role));
    }

    @GetMapping("getPlayerMinPay/{minPay}")// ritorno tutti i giocatori del campionato tramite ruolo
    public ResponseEntity<List<PlayerResponse>> getListPlayerForMinPay(@PathVariable @Min(message = "Error value min is 0", value = 0)
                                                                 @Max(message = "Error value max is 1.000.000.000" , value = 1000000000) Integer minPay){
        return ResponseEntity.status(HttpStatus.OK).body(servicePlayer.getPlayerForMinPay(minPay));
    }

    @GetMapping("getPlayerMaxPay/{maxPay}")// ritorno tutti i giocatori del campionato tramite ruolo
    public ResponseEntity<List<PlayerResponse>> getListPlayerForMaxPay(@PathVariable @Min(message = "Error value min is 1.000", value = 1000)
                                                                      @Max(message = "Error value max is 1.000.000.000" , value = 1000000000) Integer maxPay){
        return ResponseEntity.status(HttpStatus.OK).body(servicePlayer.getPlayerForMaxPay(maxPay));
    }

    @GetMapping("GetPlayerNameSurname/{name}/{surname}")// ritorno tramite nome cognome
    public ResponseEntity<PlayerResponse> getListPlayerForName(@PathVariable @NotBlank(message = "Error name not null") String name ,
                                                               @PathVariable @NotBlank(message = "Error surname not null") String surname){
        return ResponseEntity.status(HttpStatus.OK).body(servicePlayer.getPlayerForName(name , surname));
    }



}
