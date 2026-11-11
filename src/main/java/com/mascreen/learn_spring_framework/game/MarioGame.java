package com.mascreen.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * MarioGame
 */

@Component
@Qualifier("MarioGameQualifier") // to override the primary annotated component, we use @Qualifier
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go into a hole");
    }

    public void left() {
        System.out.println("Go Back");

    }

    public void right() {
        System.out.println("Accelerate");
    }

}
