package com.puricellafederico.my_app_calcio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity(name = "campionato")
@Getter
@Setter
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

}
