package com.alebaffa.entities;

import com.alebaffa.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class FootballGameTest {
    @Autowired
    private Game game;
    @Autowired
    private ApplicationContext context;

    @Test
    public void testPlayGame() throws Exception {
        String homeTeam = game.getHomeTeam().getName();
        String awayTeam = game.getAwayTeam().getName();

        String result = game.playGame();
        assertTrue(result.contains(homeTeam) || result.contains(awayTeam));
    }
}
