package com.mera.training.practice4;

import java.util.Random;

public abstract class AbstractFabric {
    protected Random random = new Random();
    public abstract Fruit makeFruit();
}
