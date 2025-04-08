package com.PuricellaFederico.my_app_calcio.response.championshipResponse;

public class Championship implements ChampionshipInterfaceResponse{

    private String name;

    private Integer firstPrize;

    private Integer secondPrice;

    private Integer thirdPrize;

    private String partecipationPrize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFirstPrize() {
        return firstPrize;
    }

    public void setFirstPrize(Integer firstPrize) {
        this.firstPrize = firstPrize;
    }

    public Integer getSecondPrice() {
        return secondPrice;
    }

    public void setSecondPrice(Integer secondPrice) {
        this.secondPrice = secondPrice;
    }

    public Integer getThirdPrize() {
        return thirdPrize;
    }

    public void setThirdPrize(Integer thirdPrize) {
        this.thirdPrize = thirdPrize;
    }

    public String getPartecipationPrize() {
        return partecipationPrize;
    }

    public void setPartecipationPrize(String partecipationPrize) {
        this.partecipationPrize = partecipationPrize;
    }
}
