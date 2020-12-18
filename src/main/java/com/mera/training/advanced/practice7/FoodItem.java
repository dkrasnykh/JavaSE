package com.mera.training.advanced.practice7;

public class FoodItem extends ShopItem {
    protected int calories;
    protected int shelfLife;

    public FoodItem(String name, double price, int calories, int shelfLife) {
        super(name, price);
        this.calories = calories;
        this.shelfLife = shelfLife;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
}
