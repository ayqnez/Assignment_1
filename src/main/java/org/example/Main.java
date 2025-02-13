package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Cat cat = context.getBean(Cat.class);
        System.out.println(cat.getName());

        Cat cat2 = context.getBean("catToma", Cat.class);
        System.out.println(cat2.getName());

        Human human = context.getBean("humanWithVasya", Human.class);
        human.setName("Ayan");
        System.out.println(human);

        Human human1 = context.getBean("humanWithToma", Human.class);
        System.out.println(human1);
    }
}