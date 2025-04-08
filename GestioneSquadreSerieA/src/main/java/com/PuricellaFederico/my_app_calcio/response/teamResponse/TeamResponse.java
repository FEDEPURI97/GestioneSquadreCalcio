package com.puricellafederico.my_app_calcio.response.teamResponse;

import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerForTeamResponse;

import java.util.List;

public class TeamResponse {

    private String name;

    private Integer budgetYear;

    private List<PlayerForTeamResponse> responsePlayerList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBudgetYear() {
        return budgetYear;
    }

    public void setBudgetYear(Integer budgetYear) {
        this.budgetYear = budgetYear;
    }

    public List<PlayerForTeamResponse> getResponsePlayerList() {
        return responsePlayerList;
    }

    public void setResponsePlayerList(List<PlayerForTeamResponse> responsePlayerList) {
        this.responsePlayerList = responsePlayerList;
    }
}
