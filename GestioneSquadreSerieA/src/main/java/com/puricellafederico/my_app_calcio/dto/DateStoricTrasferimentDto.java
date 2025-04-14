package com.puricellafederico.my_app_calcio.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DateStoricTrasferimentDto {

    private BigDecimal salaryPlayer;

    private BigDecimal budgetTeamBuy;

    private BigDecimal budgetTeamSell;

    private BigDecimal priceTranfer;

}
