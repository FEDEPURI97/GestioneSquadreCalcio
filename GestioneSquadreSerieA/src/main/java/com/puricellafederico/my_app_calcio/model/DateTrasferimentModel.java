package com.puricellafederico.my_app_calcio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "trasferimenti")
@Getter
@Setter
public class DateTrasferimentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "stipendio_giocatore")
    private BigDecimal salaryPlayer;

    @Column(name = "budget_squadra_fornisce")
    private BigDecimal budgetTeamBuy;

    @Column(name = "budget_squadra_cliente")
    private BigDecimal budgetTeamSell;

    @Column(name = "prezzo_trasferimento")
    private BigDecimal priceTranfer;

}
