package com.puricellafederico.my_app_calcio.factory;

import com.puricellafederico.my_app_calcio.model.ChampionshipModel;
import com.puricellafederico.my_app_calcio.model.PlayerModel;
import com.puricellafederico.my_app_calcio.model.TeamModel;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipResponse;
import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerForTeamResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamStaticsResponse;
import org.apache.velocity.VelocityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VelocityFactory {

    @Autowired
    private Mapper mapper;

    public VelocityContext getContext(TeamModel model){
        VelocityContext context = new VelocityContext();
        TeamStaticsResponse teamStatics = mapper.toTeamStaticsResponse(model);
        teamStatics.setPoint();
        context.put("Point" , teamStatics.getPoint());
        context.put("Team" , teamStatics);
        context.put("BudgetTeam" , model.getBudgetYear());
        List<PlayerForTeamResponse> players = new ArrayList<>();
        for (PlayerModel playerModel : model.getPlayerModel()) {
            players.add(mapper.toPlayerForTeamResponse(playerModel));
        }
        context.put("Players" , players);
        List<ChampionshipResponse> championsships = new ArrayList<>();
        for (ChampionshipModel campionshipModel : model.getChampionshipModel()){
            championsships.add(mapper.toChampionship(campionshipModel));
        }
        context.put("Championship" , championsships);
        return context;
    }

}
