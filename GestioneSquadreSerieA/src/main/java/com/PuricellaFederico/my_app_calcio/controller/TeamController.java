package com.puricellafederico.my_app_calcio.controller;

import com.puricellafederico.my_app_calcio.response.teamResponse.TeamResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamStaticsResponse;
import com.puricellafederico.my_app_calcio.service.TeamService;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "Squadra", produces = {MediaType.APPLICATION_JSON_VALUE, "application/json"})
@Validated
public class TeamController {

    @Autowired
    TeamService service;

    @PutMapping("/updateMatch/{name}/{outCome}")
    public ResponseEntity<String> updateWinLoseDraw(@PathVariable @NotBlank(message = "Error name not null") String name ,
                                                    @PathVariable  @Pattern(regexp = "(win|lose|draw|WIN|LOSE|DRA)",
                                                            message = "Error value option is 'win', 'lose' , 'draw' or this value uppercase")String outCome){
        service.updateTeam(name , outCome);
        return ResponseEntity.status(HttpStatus.OK).body("UpdateTeamSuccessFull");
    }

    @GetMapping("/")// ritorno tutte le squadre del campionato
    public ResponseEntity<List<TeamResponse>> getListTeam(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllTeam());
    }

    @GetMapping("/getTeamName/{name}")//ritorno la squadra tramite il nome
    public ResponseEntity<TeamResponse> getTeamForName(@PathVariable @NotBlank(message = "Error name not null") String name){
        return ResponseEntity.status(HttpStatus.OK).body(service.getTeamForName(name));
    }

    @GetMapping("/getTeamMin/{minBudget}")//ritorno le squadre che hanno almeno un certo budget
    public ResponseEntity<List<TeamResponse>> getTeamForBudgetMin(@PathVariable @Min(message = "Error value min is 0", value = 0)
                                                                      @Max(message = "Error value max is 1.000.000.000" , value = 1000000000) Integer minBudget){
        return ResponseEntity.status(HttpStatus.OK).body(service.getTeamMinBudget(minBudget));
    }

    @GetMapping("/getTeamMax/{maxBudget}")//ritorno le squadre che hanno massimo un certo budget
    public ResponseEntity<List<TeamResponse>> getTeamForBudgetMax(@PathVariable @Min(message = "Error value min is 1.000", value = 1000)
                                                                      @Max(message = "Error value max is 1.000.000.000" , value = 1000000000)Integer maxBudget){
        return ResponseEntity.status(HttpStatus.OK).body(service.getTeamMaxBudget(maxBudget));
    }

    @GetMapping("/getTeamPosition/{position}")//ritorno squadra tramite posto in classifica
    public ResponseEntity<TeamResponse> getTeamForPosition(@PathVariable @Min(message = "Error value min is 1", value = 1)
                                                               @Max(message = "Error value max id 20", value = 20)Integer position){
        return ResponseEntity.status(HttpStatus.OK).body(service.getTeamForPosition(position));
    }

    @GetMapping("/getTeamStatics/{name}")//ritorno le statistiche esiti partite
    public ResponseEntity<TeamStaticsResponse> getTeamMatchOutCome(@PathVariable @NotBlank(message = "Error name not null") String name){
        return ResponseEntity.status(HttpStatus.OK).body(service.getStaticsTeam(name));
    }




}
