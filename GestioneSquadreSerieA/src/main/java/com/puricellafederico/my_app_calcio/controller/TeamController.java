package com.puricellafederico.my_app_calcio.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipInterfaceResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamPlayerResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamResponseInterface;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamStaticsResponse;
import com.puricellafederico.my_app_calcio.service.TeamService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.util.List;


@RestController
@RequestMapping(value = "Team", produces = {MediaType.APPLICATION_JSON_VALUE, "application/json"})
@Validated
public class TeamController {

    @Autowired
    private TeamService service;

    @Operation(
            summary = "Update team by outcome and name",
            description = "Aggiorno l'esito partita squadra tramite l'esito e tramite il nome squadra",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
                    )
            }
    )
    @PutMapping("/updateMatch/{name}/{outCome}")
    public ResponseEntity<String> updateWinLoseDraw(@PathVariable @NotBlank(message = "Error name not null") String name ,
                                                    @PathVariable  @Pattern(regexp = "(win|lose|draw|WIN|LOSE|DRA)",
                                                            message = "Error value option is 'win', 'lose' , 'draw' or this value uppercase")String outCome){
        service.updateTeam(name , outCome);
        return ResponseEntity.status(HttpStatus.OK).body("UpdateTeamSuccessFull");
    }


    @Operation(
            summary = "Get all Team",
            description = "Ritorno la lista di tutte le squadre",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = TeamResponse.class))
                    )
            }
    )
    @GetMapping("/")// ritorno tutte le squadre del campionato
    public ResponseEntity<List<TeamResponse>> getListTeam(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllTeam());
    }


    @Operation(
            summary = "Get team by name",
            description = "Prendo la squadra tramite il nome",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = TeamPlayerResponse.class))
                    )
            }
    )
    @GetMapping("/getTeamName/{name}")
    public ResponseEntity<TeamPlayerResponse> getTeamForName(@PathVariable @NotBlank(message = "Error name not null") String name){
        return ResponseEntity.status(HttpStatus.OK).body(service.getTeamForName(name));
    }


    @Operation(
            summary = "Get all team by minimum budget in milion",
            description = "Prendo le squadre che hanno minimo un certo budget in milioni",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = TeamResponse.class))
                    )
            }
    )
    @GetMapping("/getTeamMin/{minBudget}")
    public ResponseEntity<List<TeamResponse>> getTeamForBudgetMin(@PathVariable @Min(message = "Error value min is 0", value = 0)
                                                                      @Max(message = "Error value max is 1.000.000.000" , value = 1000) Integer minBudget){
        return ResponseEntity.status(HttpStatus.OK).body(service.getTeamMinBudget(minBudget));
    }


    @Operation(
            summary = "Get all team by maximum budget in million",
            description = "Prendo le squadre che hanno massimo un certo budget in milioni",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = TeamResponse.class))
                    )
            }
    )
    @GetMapping("/getTeamMax/{maxBudget}")
    public ResponseEntity<List<TeamResponse>> getTeamForBudgetMax(@PathVariable @Min(message = "Error value min is 1", value = 1)
                                                                      @Max(message = "Error value max is 1.000" , value = 1000)Integer maxBudget){
        return ResponseEntity.status(HttpStatus.OK).body(service.getTeamMaxBudget(maxBudget));
    }


    @Operation(
            summary = "Get team by place in the ranking",
            description = "Prendo la squadra tramite il posto in classifica",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = TeamResponse.class))
                    )
            }
    )
    @GetMapping("/getTeamPosition/{position}")
    public ResponseEntity<TeamResponse> getTeamForPosition(@PathVariable @Min(message = "Error value min is 1", value = 1)
                                                               @Max(message = "Error value max id 20", value = 20)Integer position){
        return ResponseEntity.status(HttpStatus.OK).body(service.getTeamForPosition(position));
    }


    @Operation(
            summary = "Get statics team by name",
            description = "Prendo la squadra tramite con le statistiche di degli esiti e il punteggio in campionato",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = TeamStaticsResponse.class))
                    )
            }
    )
    @GetMapping("/getTeamStatics/{name}")
    public ResponseEntity<TeamStaticsResponse> getTeamMatchOutCome(@PathVariable @NotBlank(message = "Error name not null") String name){
        return ResponseEntity.status(HttpStatus.OK).body(service.getStaticsTeam(name));
    }


    @Operation(
            summary = "Get diagram team by name",
            description = "Ricavo il diagramma della squadra tramite il nome",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = TeamStaticsResponse.class))
                    )
            }
    )
    @GetMapping("/getDiagramTeam/{name}")
    public ResponseEntity<InputStreamResource> getTeamDiagram(@PathVariable @NotBlank(message = "Error name not null") String name){

        InputStream inputStream = service.getTeamDiagram(name);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=team_diagram.puml")
                .contentType(MediaType.TEXT_PLAIN)
                .body(new InputStreamResource(inputStream));
    }

    @GetMapping("/getTeamPricePlayerPredict/{nameTeam}/{namePlayerBuy}/{surnamePlayerBuy}")
    public ResponseEntity<String> getTeamMatchOutCome(@PathVariable @NotBlank(message = "Error name not null") String nameTeam ,
                                                      @PathVariable @NotBlank(message = "Error name not null") String namePlayerBuy ,
                                                      @PathVariable @NotBlank(message = "Error name not null") String surnamePlayerBuy) throws JsonProcessingException {
        return ResponseEntity.status(HttpStatus.OK).body(service.getPredictPlayer(nameTeam , namePlayerBuy ,surnamePlayerBuy));
    }




}
