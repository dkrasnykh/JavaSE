package com.mera.training.advanced.practice7;

import java.util.Collection;
import java.util.Iterator;

public class RichVisitor implements ShopVisitor {
    @Override
    public void visitShop(Collection<? extends ShopItem> items) {
        Iterator iterator = items.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            ShopItem item = (ShopItem) iterator.next();
            if (i % 2 == 1) {
                System.out.println("Товар " + item.getName() + " куплен");
                iterator.remove();
            }
            i++;
        }
    }
}
