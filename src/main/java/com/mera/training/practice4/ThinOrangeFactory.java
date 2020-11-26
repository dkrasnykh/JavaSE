package com.mera.training.practice4;

public class ThinOrangeFactory extends AbstractFabric {
    @Override
    public Fruit makeFruit() {
        return new Orange(random.nextInt(100) + 100, random.nextInt(4) + 1);
    }
}
