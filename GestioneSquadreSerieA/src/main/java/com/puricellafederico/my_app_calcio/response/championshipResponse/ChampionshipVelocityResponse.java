package com.puricellafederico.my_app_calcio.response.championshipResponse;

import lombok.Data;

@Data
public class ChampionshipVelocityResponse extends ChampionshipResponse{

    private Integer id;

    public void setVelocityId() {
        this.id *= 1000;
    }

}
