package com.mera.training.practice4;

public class Fruit {
    protected int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}
