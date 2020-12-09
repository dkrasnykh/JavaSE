package com.mera.training.practice7;

import java.util.Objects;

public class Fox extends WildAnimal {
    public Fox(String name) {
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
        Fox fox = (Fox) o;
        return Objects.equals(this.name, fox.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' +
                '}';
    }
}
