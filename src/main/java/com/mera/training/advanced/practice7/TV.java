package com.mera.training.advanced.practice7;

public class TV extends ElectronicItem {
    private int volume;

    public TV(String name, double price, int power, int volume) {
        super(name, price, power);
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "TV{" +
                "volume=" + volume +
                ", power=" + power +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
