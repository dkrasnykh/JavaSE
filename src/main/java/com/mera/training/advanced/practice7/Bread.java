package com.mera.training.advanced.practice7;

public class Bread extends FoodItem {
    private int weight;

    public Bread(String name, double price, int calories, int shelfLife, int weight) {
        super(name, price, calories, shelfLife);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "weight=" + weight +
                ", calories=" + calories +
                ", shelfLife=" + shelfLife +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
