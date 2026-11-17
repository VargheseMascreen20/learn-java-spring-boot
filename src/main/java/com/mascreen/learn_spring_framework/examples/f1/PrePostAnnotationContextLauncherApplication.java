package com.mascreen.learn_spring_framework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Some Logic Using Some Dependency");
    }

}

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready!!");
    }

    @PostConstruct // used to do some intitialization logic as soon as the dependencies are wired
                   // eg:- fetching some data from db
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy // used to clean up a bean before it is removed from the application ctx.
    public void cleanUp() {
        System.out.println("Cleanup");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class);) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}