package com.mera.training.advanced.practice7;

import java.util.Collection;

public class ElectronicFabric {
    public void fillShopWithElectronicGoods(Collection<? super ElectronicItem> items) {
        System.out.print("В магазин добавлены товары: ");

        TV tv1 = new TV("TV1", 10000, 5, 5);
        items.add(tv1);
        System.out.print(tv1 + "  ");

        TV tv2 = new TV("TV2", 11000, 6, 2);
        items.add(tv2);
        System.out.print(tv2 + "  ");

        Refrigerator ref1 = new Refrigerator("Refrigerator1", 12000, 4, 10);
        items.add(ref1);
        System.out.print(ref1 + "  ");

        Refrigerator ref2 = new Refrigerator("Refrigerator2", 13000, 5, 10);
        items.add(ref2);
        System.out.println(ref2 + "  ");
    }
}
