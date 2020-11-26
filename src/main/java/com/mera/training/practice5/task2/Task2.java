package com.mera.training.practice5.task2;

import java.util.Random;

public class Task2 {
    static String[] names = new String[]{"Александра", "Алина", "Алла", "Анастасия", "Анжела", "Анна", "Антонина", "Валентина",
            "Валерия", "Вероника", "Виктория", "Галина", "Александр", "Алексей", "Анатолий", "Андрей",
            "Антон", "Аркадий", "Артем", "Борислав", "Вадим", "Валентин", "Валерий", "Василий"};
    final static int LENGTH = 10;

    public static void main(String[] args) {
        Person[] people = new Person[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            people[i] = new Person(names[random.nextInt(names.length)], Season.values()[random.nextInt(Season.values().length)]);
        }

        for (Person person : people) {
            System.out.printf("%10s - %s%n", person.getName(), person.getSeason().game.getDescription());
        }
    }
}
