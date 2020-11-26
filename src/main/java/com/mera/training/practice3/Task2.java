package com.mera.training.practice3;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(new SequentialRandom().getNumber());
        System.out.println(new SequentialRandom().getNumber());
        System.out.println(new SequentialRandom().getNumber());
        SequentialRandom.resetRandom();
        System.out.println(new SequentialRandom().getNumber());
        System.out.println(new SequentialRandom().getNumber());
        System.out.println(new SequentialRandom().getNumber());
    }
}
