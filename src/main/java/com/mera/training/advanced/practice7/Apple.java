package com.mera.training.advanced.practice7;

public class Apple extends FoodItem {
    private String color;

    public Apple(String name, double price, int calories, int shelfLife, String color) {
        super(name, price, calories, shelfLife);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", calories=" + calories +
                ", shelfLife=" + shelfLife +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
