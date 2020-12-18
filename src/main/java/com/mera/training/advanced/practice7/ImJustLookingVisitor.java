package com.mera.training.advanced.practice7;

import java.util.Collection;

public class ImJustLookingVisitor implements ShopVisitor {
    @Override
    public void visitShop(Collection<? extends ShopItem> items) {
        for(ShopItem item : items){
            System.out.println("Название: "+item.getName()+"; цена: "+item.getPrice());
        }
    }
}
