package com.puricellafederico.my_app_calcio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity(name = "giocatori")
@Getter
@Setter
public class PlayerModel {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_giocatore")
    private Integer id;

    @Column(name = "nome")
    private String name;

    @Column(name = "cognome")
    private String surname;

    @Column(name = "data_nascita")
    private Date dateBirth;

    @Column(name = "ruolo")
    private String role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "id_squadra")
    private TeamModel team;

    @Column(name = "stipendio")
    private Integer salary;

    @Column(name = "numero_maglia")
    private Integer numberShirt;
}
