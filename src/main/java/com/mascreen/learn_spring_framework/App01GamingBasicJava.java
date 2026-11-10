package com.mascreen.learn_spring_framework;

import com.mascreen.learn_spring_framework.game.GameRunner;
import com.mascreen.learn_spring_framework.game.MarioGame;
import com.mascreen.learn_spring_framework.game.Pacman;
import com.mascreen.learn_spring_framework.game.SuperContra;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        // var game = new MarioGame();
        // var game = new SuperContra();
        var game = new Pacman();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}