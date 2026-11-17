package com.mascreen.learn_spring_framework.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {

}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class);) {

            //
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));

            // OUTPUT

            // For normal spring class, spring creates a signleton class
            // com.mascreen.learn_spring_framework.examples.e1.NormalClass@58a9760d
            // com.mascreen.learn_spring_framework.examples.e1.NormalClass@58a9760d
            // com.mascreen.learn_spring_framework.examples.e1.NormalClass@58a9760d

            // For classes marked with scope, spring creates different instances when it is
            // referred to,
            // com.mascreen.learn_spring_framework.examples.e1.PrototypeClass@394df057
            // com.mascreen.learn_spring_framework.examples.e1.PrototypeClass@4961f6af
            // com.mascreen.learn_spring_framework.examples.e1.PrototypeClass@5aebe890
        }

    }
}