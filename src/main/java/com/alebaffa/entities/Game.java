package com.alebaffa.entities;

/**
 * Created by abaffa on 05/05/2017.
 */
public interface Game {
    void setHomeTeam(Team team);
    Team getHomeTeam();
    void setAwayTeam(Team team);
    Team getAwayTeam();
    String playGame();
}
