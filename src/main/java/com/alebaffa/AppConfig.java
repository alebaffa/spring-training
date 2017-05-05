package com.alebaffa;

import com.alebaffa.entities.FootballGame;
import com.alebaffa.entities.Game;
import com.alebaffa.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.alebaffa")
@EnableAspectJAutoProxy
public class AppConfig {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private List<Team> teams;

    @Bean
    public Game game(){
        FootballGame footballGame = new FootballGame(teams.get(0), teams.get(1));
        footballGame.setDataSource(dataSource);
        return footballGame;
    }
}
