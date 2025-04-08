package com.puricellafederico.my_app_calcio.response.teamResponse;

public class TeamStaticsResponse {

    private String name;

    private Integer numberPlayer;

    private Integer win;

    private Integer lose;

    private Integer draw;

    private Integer point;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberPlayer() {
        return numberPlayer;
    }

    public void setNumberPlayer(Integer numberPlayer) {
        this.numberPlayer = numberPlayer;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getLose() {
        return lose;
    }

    public void setLose(Integer lose) {
        this.lose = lose;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public void setPoint(){
        this.point = draw + (win * 3 );
    }

    public Integer getPoint() {
        return point;
    }
}
