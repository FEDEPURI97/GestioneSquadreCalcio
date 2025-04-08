package com.PuricellaFederico.my_app_calcio.model;

import jakarta.persistence.*;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity(name = "campionato")
public class ChampionshipModel {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_campionato")
    private Integer id;

    @Column(name = "nome_torneo")
    private String name;

    @Column(name = "premio_primo_posto")
    private Integer firstPrize;

    @Column(name = "premio_secondo_posto")
    private Integer secondPrice;

    @Column(name = "premio_terzo_posto")
    private Integer thirdPrize;

    @Column(name = "premio_base_partecipazione")
    private String partecipationPrize;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "championshipModel")
    private List<TeamModel> teams;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameChampionship() {
        return name;
    }

    public void setNameChampionship(String nameChampionship) {
        this.name = nameChampionship;
    }

    public Integer getFirstPrize() {
        return firstPrize;
    }

    public void setFirstPrize(Integer firstPrize) {
        this.firstPrize = firstPrize;
    }

    public Integer getSecondPrice() {
        return secondPrice;
    }

    public void setSecondPrice(Integer secondPrice) {
        this.secondPrice = secondPrice;
    }

    public Integer getThirdPrize() {
        return thirdPrize;
    }

    public void setThirdPrize(Integer thirdPrize) {
        this.thirdPrize = thirdPrize;
    }

    public String getPartecipationPrize() {
        return partecipationPrize;
    }

    public void setPartecipationPrize(String partecipationPrize) {
        this.partecipationPrize = partecipationPrize;
    }

    public List<TeamModel> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamModel> teams) {
        this.teams = teams;
    }
}
