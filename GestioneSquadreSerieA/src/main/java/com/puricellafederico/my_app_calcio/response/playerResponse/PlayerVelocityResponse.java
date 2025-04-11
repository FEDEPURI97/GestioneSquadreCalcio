package com.puricellafederico.my_app_calcio.response.playerResponse;

import lombok.Data;

@Data
public class PlayerVelocityResponse extends PlayerForTeamResponse{

    private Integer id;

    public void setVelocityId() {
        this.id *= 10;
    }
}
