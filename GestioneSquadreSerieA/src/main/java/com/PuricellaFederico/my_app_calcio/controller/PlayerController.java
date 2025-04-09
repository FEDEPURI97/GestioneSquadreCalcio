package com.puricellafederico.my_app_calcio.controller;

import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipInterfaceResponse;
import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerResponse;
import com.puricellafederico.my_app_calcio.service.PlayerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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
    private PlayerService servicePlayer;

    @Operation(
            summary = "Get list Player by name team",
            description = "Prendo giocatori tramite il nome del team",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChampionshipInterfaceResponse.class))
                    )
            }
    )
    @GetMapping("getPlayerNameTeam/{nameTeam}")
    public ResponseEntity<List<PlayerResponse>> getListPlayerForTeam(@PathVariable  @NotBlank(message = "Error name not null") String nameTeam){
        return ResponseEntity.status(HttpStatus.OK).body(servicePlayer.getPlayerForTeam(nameTeam));
    }


    @Operation(
            summary = "Get all Player by role",
            description = "Prendo i giocatori tramite il ruolo",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChampionshipInterfaceResponse.class))
                    )
            }
    )
    @GetMapping("getPlayerRole/{role}")
    public ResponseEntity<List<PlayerResponse>> getListPlayerForRole(@PathVariable  @Pattern(regexp = "(?i)(portiere|attaccante|difensore|centrocampista|)",
                                message = "Error value option is 'portiere' , 'difensore' , 'centrocampista' , attaccante or this value ignore case") String role){
        return ResponseEntity.status(HttpStatus.OK).body(servicePlayer.getPlayerForRole(role));
    }


    @Operation(
            summary = "Get all Player by minimum budget",
            description = "Prendo i giocatori tramite il budget minimo",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChampionshipInterfaceResponse.class))
                    )
            }
    )
    @GetMapping("getPlayerMinPay/{minPay}")
    public ResponseEntity<List<PlayerResponse>> getListPlayerForMinPay(@PathVariable @Min(message = "Error value min is 0", value = 0)
                                                                 @Max(message = "Error value max is 1.000.000.000" , value = 1000000000) Integer minPay){
        return ResponseEntity.status(HttpStatus.OK).body(servicePlayer.getPlayerForMinPay(minPay));
    }


    @Operation(
            summary = "Get all Player by maximum budget",
            description = "Prendo i giocatori tramite il budget massimo",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChampionshipInterfaceResponse.class))
                    )
            }
    )
    @GetMapping("getPlayerMaxPay/{maxPay}")
    public ResponseEntity<List<PlayerResponse>> getListPlayerForMaxPay(@PathVariable @Min(message = "Error value min is 1.000", value = 1000)
                                                                      @Max(message = "Error value max is 1.000.000.000" , value = 1000000000) Integer maxPay){
        return ResponseEntity.status(HttpStatus.OK).body(servicePlayer.getPlayerForMaxPay(maxPay));
    }


    @Operation(
            summary = "Get player by name and surname",
            description = "Prendo giocatore tramite nome e cognome",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChampionshipInterfaceResponse.class))
                    )
            }
    )
    @GetMapping("GetPlayerNameSurname/{name}/{surname}")
    public ResponseEntity<PlayerResponse> getListPlayerForName(@PathVariable @NotBlank(message = "Error name not null") String name ,
                                                               @PathVariable @NotBlank(message = "Error surname not null") String surname){
        return ResponseEntity.status(HttpStatus.OK).body(servicePlayer.getPlayerForName(name , surname));
    }



}
