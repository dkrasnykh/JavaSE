package com.mera.training.advanced.practice7;

import java.util.Collection;

public class AppleGarden {
    public void fillShopWithApples(Collection<? super Apple> apples) {
        System.out.print("В магазин добавлены яблоки: ");

        Apple apple1 = new Apple("apple1", 5, 5, 5, "зеленое");
        apples.add(apple1);
        System.out.print(apple1.getColor() + " ");

        Apple apple2 = new Apple("apple2", 5, 5, 5, "желтое");
        apples.add(apple2);
        System.out.print(apple2.getColor() + " ");

        Apple apple3 = new Apple("apple3", 5, 5, 5, "красное");
        apples.add(apple3);
        System.out.println(apple3.getColor());
    }
}
