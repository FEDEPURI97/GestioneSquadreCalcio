package com.puricellafederico.my_app_calcio.response.playerResponse;

import com.puricellafederico.my_app_calcio.response.championshipResponse.TeamChampionshipResponse;
import lombok.Data;

import java.util.Date;

@Data
public class PlayerResponse {

    private String name;

    private String surname;

    private Date dateBirth;

    private String role;

    private TeamChampionshipResponse teamChampionship;

    private Integer salary;

    private Integer numberShirt;

}
