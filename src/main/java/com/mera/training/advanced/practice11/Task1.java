package com.mera.training.advanced.practice11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Person4", 56));
        people.add(new Person("Person1", 12));
        people.add(new Person("Person3", 5));
        people.add(new Person("Person2", 32));

        Collections.sort(people, (p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println(people);

        Collections.sort(people, (p1, p2)-> p1.age - p2.age);
        System.out.println(people);
    }
}
