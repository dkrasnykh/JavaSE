package com.mera.training.practice4;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    static final int LENGHT = 4;

    public static Fruit getRandomFruit() {
        Random random = new Random();
        int rand = random.nextInt(3);
        if (rand == 0) {
            return new Apple(random.nextInt(100) + 100, Color.values()[random.nextInt(3)]);
        } else if (rand == 1) {
            return new Orange(random.nextInt(100) + 100, random.nextInt(20));
        } else {
            return new Pineapple(random.nextInt(500) + 1000, random.nextInt(15) + 5);
        }
    }

    public static void main(String[] args) {
        Fruit[] fruits  = new Fruit[LENGHT];
        for (int i = 0; i < LENGHT; i++) {
            fruits[i] = getRandomFruit();
        }
        System.out.println(Arrays.toString(fruits));
    }
}
