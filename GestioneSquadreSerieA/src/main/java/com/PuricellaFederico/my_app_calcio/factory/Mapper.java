package com.puricellafederico.my_app_calcio.factory;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipResponse;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipVelocityResponse;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipWhitTeamResponse;
import com.puricellafederico.my_app_calcio.response.championshipResponse.TeamChampionshipResponse;
import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerVelocityResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamVelocityResponse;
import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerResponse;
import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerForTeamResponse;
import com.puricellafederico.my_app_calcio.model.ChampionshipModel;
import com.puricellafederico.my_app_calcio.model.PlayerModel;
import com.puricellafederico.my_app_calcio.model.TeamModel;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamPlayerResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamStaticsResponse;


@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {

    ChampionshipResponse toChampionship(ChampionshipModel model);

    ChampionshipWhitTeamResponse toChampionshipWhitTeam(ChampionshipModel model);

    TeamChampionshipResponse toTeamName(TeamModel model);

    PlayerResponse toPlayerResponse(PlayerModel playerModel);

    TeamResponse toTeamResponse(TeamModel teamModel);

    TeamPlayerResponse toTeamPlayerResponse(TeamModel teamModel);

    PlayerForTeamResponse toPlayerForTeamResponse(PlayerModel model);

    TeamStaticsResponse toTeamStaticsResponse(TeamModel squadraNonTrovata);

    TeamVelocityResponse toTeamVelocityResponse(TeamModel model);

    ChampionshipVelocityResponse toChampionshipVelocity(ChampionshipModel campionshipModel);

    PlayerVelocityResponse toPlayerVelocityResponse(PlayerModel playerModel);
}
