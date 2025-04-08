package com.puricellafederico.my_app_calcio.controller;

import com.puricellafederico.my_app_calcio.response.championshipResponse.Championship;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipInterfaceResponse;
import com.puricellafederico.my_app_calcio.service.ChampionshipService;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Campionato", produces = {MediaType.APPLICATION_JSON_VALUE, "application/json"})
@Validated
public class CampionshipController {

    @Autowired
    ChampionshipService service;

    @GetMapping("/getChampionShipName/{team}/{championShip}")// ritorno il cmapionato e squadre se true
    public ResponseEntity<ChampionshipInterfaceResponse> getTeam(@PathVariable @RequestParam("Error boolean param is required") Boolean team ,
                                                                 @PathVariable @NotBlank(message = "Error name not null") String championShip){
        ChampionshipInterfaceResponse campionShip = service.getChampionship(team , championShip);
        return ResponseEntity.status(HttpStatus.OK).body(campionShip);
    }

    @GetMapping("/")// ritorno i campionati
    public ResponseEntity<List<Championship>> getAllChampion(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }

}
