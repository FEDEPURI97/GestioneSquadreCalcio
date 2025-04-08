package com.puricellafederico.my_app_calcio.controller;

import com.puricellafederico.my_app_calcio.response.teamResponse.TeamResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamStaticsResponse;
import com.puricellafederico.my_app_calcio.service.TeamService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "Squadra", produces = {MediaType.APPLICATION_JSON_VALUE, "application/json"})
public class TeamController {

    @Autowired
    TeamService service;

    @ApiOperation(value = "Ritorna il mio nome", response = String.class)
    @ApiResponses(value = @ApiResponse(code = 200, message = "Success|OK"))
    @PutMapping("/{name}/{outCome}")//aggiorno l'esito della partita
    public ResponseEntity<String> updateWinLoseDraw(@PathVariable String name ,@PathVariable String outCome){
        service.updateTeam(name , outCome);
        return ResponseEntity.status(HttpStatus.OK).body("UpdateTeamSuccessFull");
    }

    @GetMapping("/")// ritorno tutte le squadre del campionato
    public ResponseEntity<List<TeamResponse>> getListTeam(){
        return ResponseEntity.status(500).body(service.getAllTeam());
    }

    @GetMapping("/getTeamName/{name}")//ritorno la squadra tramite il nome
    public ResponseEntity<TeamResponse> getTeamForName(@PathVariable String name){
        return ResponseEntity.status(500).body(service.getTeamForName(name));
    }

    @GetMapping("/getTeam/{minBudget}")//ritorno le squadre che hanno almeno un certo budget
    public ResponseEntity<List<TeamResponse>> getTeamForBudgetMin(@PathVariable Integer minBudget){
        return ResponseEntity.status(500).body(service.getTeamMinBudget(minBudget));
    }

    @GetMapping("/getTeam/{maxBudget}")//ritorno le squadre che hanno massimo un certo budget
    public ResponseEntity<List<TeamResponse>> getTeamForBudgetMax(@PathVariable Integer maxBudget){
        return ResponseEntity.status(500).body(service.getTeamMaxBudget(maxBudget));
    }

    @GetMapping("/getTeam/position/{position}")//ritorno squadra tramite posto in classifica
    public ResponseEntity<TeamResponse> getTeamForPosition(@PathVariable Integer position){
        return ResponseEntity.status(500).body(service.getTeamForPosition(position));
    }

    @GetMapping("/getTeam/matchOutCome/{team}")//ritorno le statistiche esiti partite
    public ResponseEntity<TeamStaticsResponse> getTeamMatchOutCome(String name){
        return ResponseEntity.status(500).body(service.getStaticsTeam(name));
    }




}
