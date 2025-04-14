package com.puricellafederico.my_app_calcio.dto;

import lombok.Data;

import java.util.List;

@Data
public class DateTrasferimentDto {

    private DatePlayerForAnalistDto datePlayer;

    private Integer budgetTeamBuy;

    private List<DateTrasferimentDto> listDateTrasferiment;

}
