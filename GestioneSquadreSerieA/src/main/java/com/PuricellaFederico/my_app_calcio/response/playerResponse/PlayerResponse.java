package com.PuricellaFederico.my_app_calcio.response.playerResponse;

import com.PuricellaFederico.my_app_calcio.response.championshipResponse.TeamChampionship;

import java.util.Date;

public class PlayerResponse {

    private String name;

    private String surname;

    private Date dateBirth;

    private String role;

    private TeamChampionship teamChampionship;

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

    public TeamChampionship getTeamChampionship() {
        return teamChampionship;
    }

    public void setTeamChampionship(TeamChampionship teamChampionship) {
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
