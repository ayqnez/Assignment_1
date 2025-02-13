package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    @Primary
    public Cat cat() {
        Cat c = new Cat();
        c.setName("Vasya");
        return c;
    }

    @Bean
    public Cat catToma() {
        Cat c = new Cat();
        c.setName("Toma");
        return c;
    }

    @Bean
    public Human humanWithToma() {
        Human h = new Human();
        h.setName("Amir");
        h.setCat(catToma());
        return h;
    }
}
