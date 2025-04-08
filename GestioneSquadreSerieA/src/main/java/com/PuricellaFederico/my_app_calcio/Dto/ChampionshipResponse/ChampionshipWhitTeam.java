package com.PuricellaFederico.my_app_calcio.Dto.ChampionshipResponse;


import java.util.List;

public class ChampionshipWhitTeam extends Championship {

    private List<TeamChampionship> teamChampionShips;

    public List<TeamChampionship> getTeamChampionShips() {
        return teamChampionShips;
    }

    public void setTeamChampionShips(List<TeamChampionship> teamChampionShips) {
        this.teamChampionShips = teamChampionShips;
    }
}
