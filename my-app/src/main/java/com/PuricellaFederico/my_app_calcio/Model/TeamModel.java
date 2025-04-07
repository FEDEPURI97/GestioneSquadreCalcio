package com.PuricellaFederico.my_app_calcio.Model;

import jakarta.persistence.*;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity(name = "squadre")
public class TeamModel {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String name;

    @Column(name = "numero_giocatori")
    private Integer numberPlayer;

    @Column(name = "budget_annuale")
    private Integer budgetYear;

    @Column(name = "vittorie")
    private Integer win;

    @Column(name = "sconfitte")
    private Integer lose;

    @Column(name = "pareggio")
    private Integer draw;

    @OneToMany(mappedBy = "team", fetch = FetchType.LAZY)
    private List<PlayerModel> playerModel;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "campionato_in_corso",
            joinColumns = {@JoinColumn(name = "id_squadra")},
            inverseJoinColumns = {@JoinColumn(name = "id_campionato")}
    )
    private List<ChampionshipModel> championshipModel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberPlayer() {
        return numberPlayer;
    }

    public void setNumberPlayer(Integer numberPlayer) {
        this.numberPlayer = numberPlayer;
    }

    public Integer getBudgetYear() {
        return budgetYear;
    }

    public void setBudgetYear(Integer budgetYear) {
        this.budgetYear = budgetYear;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getLose() {
        return lose;
    }

    public void setLose(Integer lose) {
        this.lose = lose;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public List<PlayerModel> getPlayerModel() {
        return playerModel;
    }

    public void setPlayerModel(List<PlayerModel> playerModel) {
        this.playerModel = playerModel;
    }

    public List<ChampionshipModel> getChampionshipModel() {
        return championshipModel;
    }

    public void setChampionshipModel(List<ChampionshipModel> championshipModel) {
        this.championshipModel = championshipModel;
    }
}
