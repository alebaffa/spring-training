package com.alebaffa;

import com.alebaffa.entities.*;

/**
 * Created by abaffa on 05/05/2017.
 */
public class RunNoSpring {
    public static void main(String[] args){
        Team milan = new Milan();
        Team inter = new Inter();
        Game game = new FootballGame(milan, inter);
        System.out.println(game.playGame());
    }
}
