package com.puricellafederico.my_app_calcio.response.teamResponse;

import lombok.Data;
import lombok.Getter;


@Data
public class TeamStaticsResponse {

    private String name;

    private Integer numberPlayer;

    private Integer win;

    private Integer lose;

    private Integer draw;

    @Getter
    private Integer point;

    public void setPoint(){
        this.point = draw + (win * 3 );
    }

}
