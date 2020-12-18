package com.mera.training.advanced.practice7;

public class Refrigerator extends ElectronicItem {
    private int size;

    public Refrigerator(String name, double price, int power, int size) {
        super(name, price, power);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "size=" + size +
                ", power=" + power +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
