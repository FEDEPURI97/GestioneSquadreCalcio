package com.puricellafederico.my_app_calcio.response.teamResponse;

public class TeamResponse implements TeamResponseInterface{

    private String name;

    private Integer budgetYear;

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


}
