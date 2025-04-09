package com.puricellafederico.my_app_calcio.response.teamResponse;

import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerForTeamResponse;
import lombok.Data;

import java.util.List;


@Data
public class TeamPlayerResponse extends TeamResponse{

    private List<PlayerForTeamResponse> responsePlayerList;

}
