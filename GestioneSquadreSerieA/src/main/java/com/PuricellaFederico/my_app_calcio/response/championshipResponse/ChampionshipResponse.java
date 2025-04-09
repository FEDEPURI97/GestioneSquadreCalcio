package com.puricellafederico.my_app_calcio.response.championshipResponse;

import lombok.Data;

@Data
public class ChampionshipResponse implements ChampionshipInterfaceResponse{

    private String name;

    private Integer firstPrize;

    private Integer secondPrice;

    private Integer thirdPrize;

    private String partecipationPrize;

}
