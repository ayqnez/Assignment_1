package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("humanWithVasya")
public class Human {
    private String name;
    private Cat cat;

    public Human() {}

    @Autowired
    public Human(@Qualifier("cat") Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
