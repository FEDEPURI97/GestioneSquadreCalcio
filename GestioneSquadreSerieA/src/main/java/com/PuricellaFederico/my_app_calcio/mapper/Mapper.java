package com.PuricellaFederico.my_app_calcio.mapper;
import com.PuricellaFederico.my_app_calcio.response.championshipResponse.Championship;
import com.PuricellaFederico.my_app_calcio.response.championshipResponse.ChampionshipWhitTeam;
import com.PuricellaFederico.my_app_calcio.response.championshipResponse.TeamChampionship;
import com.PuricellaFederico.my_app_calcio.response.playerResponse.PlayerResponse;
import com.PuricellaFederico.my_app_calcio.response.playerResponse.PlayerForTeamResponse;
import com.PuricellaFederico.my_app_calcio.model.ChampionshipModel;
import com.PuricellaFederico.my_app_calcio.model.PlayerModel;
import com.PuricellaFederico.my_app_calcio.model.TeamModel;
import com.PuricellaFederico.my_app_calcio.response.teamResponse.TeamResponse;
import com.PuricellaFederico.my_app_calcio.response.teamResponse.TeamStaticsResponse;


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
