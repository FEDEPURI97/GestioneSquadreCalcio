package com.puricellafederico.my_app_calcio.dto;

import lombok.Data;

@Data
public class DatePlayerForAnalistDto {

    private Integer salary;
    private Integer budgetYear;

    public DatePlayerForAnalistDto(Integer salary, Integer budgetYear) {
        this.salary = salary;
        this.budgetYear = budgetYear;
    }
}
