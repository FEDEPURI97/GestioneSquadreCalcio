package com.puricellafederico.my_app_calcio.response.championshipResponse;


import lombok.Data;

import java.util.List;


@Data
public class ChampionshipWhitTeamResponse extends ChampionshipResponse {

    private List<TeamChampionshipResponse> teamChampionShips;

}
