package com.mera.training.advanced.practice7;

import java.util.Collection;
import java.util.Iterator;

public class ElectronicAddictedVisitor implements ShopVisitor {
    @Override
    public void visitShop(Collection<? extends ShopItem> items) {
        Iterator iterator = items.iterator();
        Object max = iterator.next();
        while(iterator.hasNext()){
            Object o = iterator.next();
            if (o instanceof ElectronicItem){
                ElectronicItem item = (ElectronicItem)o;
                if(item.getPower() > ((ElectronicItem)max).getPower()){
                    max = item;
                }
            }
        }
        items.remove(max);
    }
}
