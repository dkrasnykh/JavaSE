package com.mera.training.advanced.practice7;

import java.util.Collection;

public class FoodFactory {
    public void fillShopWithFood(Collection<? super FoodItem> shop) {
        fillShopWithApples(shop);
        fillShopWithBreads(shop);
    }

    private void fillShopWithApples(Collection<? super Apple> shop) {
        AppleGarden appleGarden = new AppleGarden();
        appleGarden.fillShopWithApples(shop);
    }

    private void fillShopWithBreads(Collection<? super Bread> shop) {
        System.out.print("В магазин добавлен хлеб: ");
        int weight = 0;
        Bread bread1 = new Bread("bread1", 5.5, 250, 3, 100);
        weight += bread1.getWeight();
        shop.add(bread1);

        Bread bread2 = new Bread("bread2", 5.5, 250, 3, 100);
        weight += bread2.getWeight();
        shop.add(bread2);

        Bread bread3 = new Bread("bread3", 5.5, 250, 3, 100);
        weight += bread3.getWeight();
        shop.add(bread3);
        System.out.println("общим весом " + weight);
    }
}
