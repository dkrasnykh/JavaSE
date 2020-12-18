package com.mera.training.advanced.practice7;

import java.util.Collection;

public interface ShopVisitor {
    void visitShop(Collection<? extends ShopItem> collection);
}
