package com.PuricellaFederico.my_app_calcio.Mapper;
import com.PuricellaFederico.my_app_calcio.Dto.ChampionshipResponse.Championship;
import com.PuricellaFederico.my_app_calcio.Dto.ChampionshipResponse.ChampionshipWhitTeam;
import com.PuricellaFederico.my_app_calcio.Dto.ChampionshipResponse.TeamChampionship;
import com.PuricellaFederico.my_app_calcio.Dto.PlayerResponse.PlayerResponse;
import com.PuricellaFederico.my_app_calcio.Dto.TeamResponse.PlayerForTeamResponse;
import com.PuricellaFederico.my_app_calcio.Dto.TeamResponse.TeamResponse;
import com.PuricellaFederico.my_app_calcio.Dto.TeamResponse.TeamStaticsResponse;
import com.PuricellaFederico.my_app_calcio.Model.ChampionshipModel;
import com.PuricellaFederico.my_app_calcio.Model.PlayerModel;
import com.PuricellaFederico.my_app_calcio.Model.TeamModel;


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
