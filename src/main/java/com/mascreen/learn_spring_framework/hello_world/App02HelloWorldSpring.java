package com.mascreen.learn_spring_framework.hello_world;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1: Launch a Spring Context
        // 2: Configure the things that we want Spring to manage - @Configuration
        try (
                var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);) {

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("person4Parameters"));
            System.out.println("PERSON 5" + context.getBean("person5Qualifier"));
            System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean(Address.class));

            // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            ;

        }
    }
}