package com.alebaffa;

import com.alebaffa.entities.Game;
import com.alebaffa.entities.Team;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunWithSpring {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Game game = context.getBean("game", Game.class);
        Team milan = context.getBean("milan", Team.class);
        Team inter = context.getBean("inter", Team.class);
        Team juventus = context.getBean("juventus", Team.class);

        game.setHomeTeam(milan);
        game.setAwayTeam(inter);
        System.out.println(game.playGame());

        game.setHomeTeam(juventus);
        game.setAwayTeam(milan);
        System.out.println(game.playGame());

        context.close();
    }
}
