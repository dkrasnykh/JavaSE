package com.mera.training.practice7;

import java.util.Objects;

public class Cat extends PetAnimal {
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public Meal getFavoriteMeal() {
        return Meal.MILK;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o.getClass() != this.getClass()){
            return false;
        }
        Cat cat = (Cat) o;
        return Objects.equals(this.name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
