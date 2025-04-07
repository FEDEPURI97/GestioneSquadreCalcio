package com.PuricellaFederico.my_app_calcio.Controller;

import com.PuricellaFederico.my_app_calcio.Dto.TeamResponse.TeamResponse;
import com.PuricellaFederico.my_app_calcio.Dto.TeamResponse.TeamStaticsResponse;
import com.PuricellaFederico.my_app_calcio.Model.TeamModel;
import com.PuricellaFederico.my_app_calcio.Service.ServiceTeam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "Squadra", produces = {MediaType.APPLICATION_JSON_VALUE, "application/json"})
public class TeamController {

    @Autowired
    ServiceTeam service;

    @ApiOperation(value = "Ritorna il mio nome", response = String.class)
    @ApiResponses(value = @ApiResponse(code = 200, message = "Success|OK"))
    @PutMapping("/{name}/{OutCome}")//aggiorno l'esito della partita
    public ResponseEntity<String> updateWinLoseDraw(String name , String outCome){
        service.updateTeam(name , outCome);
        return ResponseEntity.status(HttpStatus.OK).body("UpdateTeamSuccessFull");
    }

    @GetMapping("/")// ritorno tutte le squadre del campionato
    public ResponseEntity<List<TeamResponse>> getListTeam(){
        return ResponseEntity.status(500).body(service.getAllTeam());
    }

    @GetMapping("/getTeamName/{name}")//ritorno la squadra tramite il nome
    public ResponseEntity<TeamResponse> getTeamForName(String name){
        return ResponseEntity.status(500).body(service.getTeamForName(name));
    }

    @GetMapping("/getTeam/minBudget/{budget}")//ritorno le squadre che hanno almeno un certo budget
    public ResponseEntity<List<TeamResponse>> getTeamForBudgetMin(Integer minBudget){
        return ResponseEntity.status(500).body(service.getTeamMinBudget(minBudget));
    }

    @GetMapping("/getTeam/maxBudget/{budget}")//ritorno le squadre che hanno massimo un certo budget
    public ResponseEntity<List<TeamResponse>> getTeamForBudgetMax(Integer maxBudget){
        return ResponseEntity.status(500).body(service.getTeamMaxBudget(maxBudget));
    }

    @GetMapping("/getTeam/position/{number}")//ritorno squadra tramite posto in classifica
    public ResponseEntity<TeamResponse> getTeamForPosition(Integer position){
        return ResponseEntity.status(500).body(service.getTeamForPosition(position));
    }

    @GetMapping("/getTeam/matchOutCome/{team}")//ritorno le statistiche esiti partite
    public ResponseEntity<TeamStaticsResponse> getTeamMatchOutCome(String name){
        return ResponseEntity.status(500).body(service.getStaticsTeam(name));
    }




}
