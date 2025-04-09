package com.puricellafederico.my_app_calcio.response.playerResponse;

import com.puricellafederico.my_app_calcio.response.championshipResponse.TeamChampionshipResponse;

import java.util.Date;

public class PlayerResponse {

    private String name;

    private String surname;

    private Date dateBirth;

    private String role;

    private TeamChampionshipResponse teamChampionship;

    private Integer salary;

    private Integer numberShirt;

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public TeamChampionshipResponse getTeamChampionship() {
        return teamChampionship;
    }

    public void setTeamChampionship(TeamChampionshipResponse teamChampionship) {
        this.teamChampionship = teamChampionship;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getNumberShirt() {
        return numberShirt;
    }

    public void setNumberShirt(Integer numberShirt) {
        this.numberShirt = numberShirt;
    }
}
