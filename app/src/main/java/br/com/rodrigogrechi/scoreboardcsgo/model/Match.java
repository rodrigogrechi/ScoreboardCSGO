package br.com.rodrigogrechi.scoreboardcsgo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Match {
    @SerializedName("event")
    @Expose
    private String event;
    @SerializedName("maps")
    @Expose
    private String maps;
    @SerializedName("team1")
    @Expose
    private Team team1;
    @SerializedName("team2")
    @Expose
    private Team team2;
    @SerializedName("matchId")
    @Expose
    private String matchId;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getMaps() {
        return maps;
    }

    public void setMaps(String maps) {
        this.maps = maps;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public Match(String event, String maps, Team team1, Team team2, String matchId) {
        this.event = event;
        this.maps = maps;
        this.team1 = team1;
        this.team2 = team2;
        this.matchId = matchId;
    }



    @Override
    public String toString() {
        return "Evento: " + event + "\nMapas: " + maps + "\nTime 1: " + team1.getName() + " - " + team1.getResult() + "\nTime 2: " + team2.getName() + " - " + team2.getResult();
    }
}
