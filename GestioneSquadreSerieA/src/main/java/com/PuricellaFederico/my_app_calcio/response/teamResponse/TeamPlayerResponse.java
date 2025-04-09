package com.puricellafederico.my_app_calcio.response.teamResponse;

import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerForTeamResponse;

import java.util.List;

public class TeamPlayerResponse extends TeamResponse{

    private List<PlayerForTeamResponse> responsePlayerList;


    public List<PlayerForTeamResponse> getResponsePlayerList() {
        return responsePlayerList;
    }


    public void setResponsePlayerList(List<PlayerForTeamResponse> responsePlayerList) {
        this.responsePlayerList = responsePlayerList;
    }
}
