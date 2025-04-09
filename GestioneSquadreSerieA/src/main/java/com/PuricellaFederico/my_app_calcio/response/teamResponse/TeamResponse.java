package com.puricellafederico.my_app_calcio.response.teamResponse;

import lombok.Data;

@Data
public class TeamResponse implements TeamResponseInterface{

    private String name;

    private Integer budgetYear;

}
