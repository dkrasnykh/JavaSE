package com.mera.training.practice5.task2;

public class Person {
    private String name;
    private Season season;

    public Person(String name, Season season) {
        this.name = name;
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public Season getSeason() {
        return season;
    }
}
