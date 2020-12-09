package com.mera.training.practice7;

import java.util.Objects;

public class Dog extends PetAnimal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public Meal getFavoriteMeal() {
        return Meal.BONES;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o.getClass() != this.getClass()){
            return false;
        }
        Dog dog = (Dog) o;
        return Objects.equals(this.name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
