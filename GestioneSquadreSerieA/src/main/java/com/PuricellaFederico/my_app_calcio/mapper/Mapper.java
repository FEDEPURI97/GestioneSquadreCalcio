package com.puricellafederico.my_app_calcio.mapper;
import com.puricellafederico.my_app_calcio.response.championshipResponse.Championship;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipWhitTeam;
import com.puricellafederico.my_app_calcio.response.championshipResponse.TeamChampionship;
import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerResponse;
import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerForTeamResponse;
import com.puricellafederico.my_app_calcio.model.ChampionshipModel;
import com.puricellafederico.my_app_calcio.model.PlayerModel;
import com.puricellafederico.my_app_calcio.model.TeamModel;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamStaticsResponse;


@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {

    Championship toChampionship(ChampionshipModel model);

    ChampionshipWhitTeam toChampionshipWhitTeam(ChampionshipModel model);

    TeamChampionship toTeamName(TeamModel model);

    PlayerResponse toPlayerResponse(PlayerModel playerModel);

    TeamResponse toTeamResponse(TeamModel teamModel);

    PlayerForTeamResponse toPlayerForTeamResponse(PlayerModel model);

    TeamStaticsResponse toTeamStaticsResponse(TeamModel squadraNonTrovata);

}
