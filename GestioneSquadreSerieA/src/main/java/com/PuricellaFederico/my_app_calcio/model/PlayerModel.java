package com.puricellafederico.my_app_calcio.model;

import jakarta.persistence.*;

import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity(name = "giocatori")
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public TeamModel getTeam() {
        return team;
    }

    public void setTeam(TeamModel team) {
        this.team = team;
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
