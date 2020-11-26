package com.mera.training.practice4;

public class Apple extends Fruit {
    private Color color;

    public Apple(int weight, Color color) {
        super(weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight + "; " +
                "color=" + color +
                '}';
    }
}
