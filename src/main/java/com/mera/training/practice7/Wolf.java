package com.mera.training.practice7;

import java.util.Objects;

public class Wolf extends WildAnimal {
    public Wolf(String name) {
        this.name = name;
    }

    @Override
    public Meal getFavoriteMeal() {
        return Meal.MEAT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o.getClass() != this.getClass()){
            return false;
        }
        Wolf wolf = (Wolf) o;
        return Objects.equals(this.name, wolf.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                '}';
    }
}
