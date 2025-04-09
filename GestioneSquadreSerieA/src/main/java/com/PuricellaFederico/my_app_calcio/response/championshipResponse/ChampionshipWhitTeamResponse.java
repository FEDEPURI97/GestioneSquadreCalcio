package com.puricellafederico.my_app_calcio.response.championshipResponse;


import java.util.List;

public class ChampionshipWhitTeamResponse extends ChampionshipResponse {

    private List<TeamChampionshipResponse> teamChampionShips;

    public List<TeamChampionshipResponse> getTeamChampionShips() {
        return teamChampionShips;
    }

    public void setTeamChampionShips(List<TeamChampionshipResponse> teamChampionShips) {
        this.teamChampionShips = teamChampionShips;
    }
}
