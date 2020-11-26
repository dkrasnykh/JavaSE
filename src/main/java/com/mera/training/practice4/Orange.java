package com.mera.training.practice4;

public class Orange extends Fruit {
    private int peelThickness;

    public Orange(int weight, int peelThickness) {
        super(weight);
        this.peelThickness = peelThickness;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight + "; " +
                "peel thickness=" + peelThickness +
                '}';
    }
}
