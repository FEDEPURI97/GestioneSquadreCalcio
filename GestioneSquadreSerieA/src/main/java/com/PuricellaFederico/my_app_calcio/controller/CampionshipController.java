package com.puricellafederico.my_app_calcio.controller;

import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipResponse;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipInterfaceResponse;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipWhitTeamResponse;
import com.puricellafederico.my_app_calcio.service.ChampionshipService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Championship", produces = {MediaType.APPLICATION_JSON_VALUE, "application/json"})
@Validated
public class CampionshipController {

    @Autowired
    ChampionshipService service;

    @Operation(
            summary = "Get Championship by team and championship name",
            description = "Prendo il torneo tramite il nome e ritorno le squadre tramite true o false.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChampionshipWhitTeamResponse.class))
                    )
            }
    )
    @GetMapping("/getChampionShipName/{team}/{championShip}")
    public ResponseEntity<ChampionshipInterfaceResponse> getTeam(
            @Parameter(description = "Boolean indicating whether to return team data", required = true)
            @PathVariable @RequestParam("Error boolean param is required") Boolean team,

            @Parameter(description = "The name of the championship", required = true)
            @PathVariable @NotBlank(message = "Error name not null") String championShip) {

        ChampionshipInterfaceResponse campionShip = service.getChampionship(team, championShip);
        return ResponseEntity.status(HttpStatus.OK).body(campionShip);
    }


    @Operation(
            summary = "Get all championships",
            description = "Ritorno la lista di tutti i tornei",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChampionshipResponse.class))
                    )
            }
    )
    @GetMapping("/")
    public ResponseEntity<List<ChampionshipResponse>> getAllChampion() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }
}
