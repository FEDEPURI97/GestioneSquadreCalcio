package com.puricellafederico.my_app_calcio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity(name = "squadre")
@Getter
@Setter
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
}
