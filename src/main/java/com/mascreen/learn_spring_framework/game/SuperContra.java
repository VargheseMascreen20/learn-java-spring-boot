package com.mascreen.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * SuperContra
 */

@Component // to allow spring to Auto-wire and do Bean creation
@Primary // when multiple components implements the same class, the compiler throws an
         // error due to confusion to which component to use, so as to give priority to
         // this particular component, we use @primary Annotation
public class SuperContra implements GamingConsole {

    public void up() {
        System.out.println("Up");
    }

    public void down() {
        System.out.println("Sit down");
    }

    public void left() {
        System.out.println("Go Back");

    }

    public void right() {
        System.out.println("Shoot a bullet");
    }
}
