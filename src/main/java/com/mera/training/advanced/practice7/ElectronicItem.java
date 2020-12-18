package com.mera.training.advanced.practice7;

public class ElectronicItem extends ShopItem{
    protected int power;

    public ElectronicItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
