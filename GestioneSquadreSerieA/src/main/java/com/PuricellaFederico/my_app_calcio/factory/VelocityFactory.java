package com.puricellafederico.my_app_calcio.factory;

import com.puricellafederico.my_app_calcio.model.ChampionshipModel;
import com.puricellafederico.my_app_calcio.model.PlayerModel;
import com.puricellafederico.my_app_calcio.model.TeamModel;
import com.puricellafederico.my_app_calcio.response.championshipResponse.ChampionshipVelocityResponse;
import com.puricellafederico.my_app_calcio.response.playerResponse.PlayerVelocityResponse;
import com.puricellafederico.my_app_calcio.response.teamResponse.TeamVelocityResponse;
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
        TeamVelocityResponse team = mapper.toTeamVelocityResponse(model);
        team.setPoint();
        context.put("Point" , team.getPoint());
        context.put("Team" , team);
        context.put("BudgetTeam" , model.getBudgetYear());
        List<PlayerVelocityResponse> players = new ArrayList<>();
        for (PlayerModel playerModel : model.getPlayerModel()) {
            players.add(mapper.toPlayerVelocityResponse(playerModel));
        }
        context.put("Players" , players);
        List<ChampionshipVelocityResponse> championsships = new ArrayList<>();
        for (ChampionshipModel campionshipModel : model.getChampionshipModel()){
            championsships.add(mapper.toChampionshipVelocity(campionshipModel));
        }
        context.put("Championship" , championsships);
        return context;
    }

}
