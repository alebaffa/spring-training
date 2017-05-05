package com.alebaffa.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

public class FootballGame implements Game {
    private Team homeTeam;
    private Team awayTeam;
    private DataSource dataSource;

    public FootballGame(Team homeTeam, Team awayTeam){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    @PostConstruct
    public void startGame(){
        System.out.println("Playing game....");
    }

    @PreDestroy
    public void endGame(){
        System.out.println("Finishing game....");
    }

    public void setHomeTeam(Team team) {
        this.homeTeam = team;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setAwayTeam(Team team) {
        this.awayTeam = team;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public String playGame() {
        return homeTeam.getName() + " VS " + awayTeam.getName();
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
