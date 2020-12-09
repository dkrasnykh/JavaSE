package com.mera.training.practice7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zoo {
    private Set<WildAnimal> wildAnimals = new HashSet<>();
    private Set<PetAnimal> petAnimals = new HashSet<>();

    public Zoo() {
        fillCollectionWithPetAnimals(petAnimals);
        fillCollectionWithWildAnimal(wildAnimals);
    }

    private void printAnimalsFromCollection(Collection<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.print(animal.name + " ");
        }
        System.out.println();
    }

    public void printAllAnimals() {
        System.out.println("Pets:");
        printAnimalsFromCollection(petAnimals);
        System.out.println("Wild animals:");
        printAnimalsFromCollection(wildAnimals);
    }

    private void fillCollectionWithPetAnimals(Collection<? super PetAnimal> pets) {
        Random random = new Random();
        int animalCount = 1 + random.nextInt(4);
        for (int i = 0; i < animalCount; i++) {
            int ind = random.nextInt(2);
            if (ind == 0) {
                pets.add(new Cat("Murka" + i));
            } else {
                pets.add(new Dog("Sharik" + i));
            }
        }
    }

    private void fillCollectionWithWildAnimal(Collection<? super WildAnimal> animals) {
        Random random = new Random();
        int animalCount = 3 + random.nextInt(7);
        for (int i = 0; i < animalCount; i++) {
            int ind = random.nextInt(2);
            if (ind == 0) {
                animals.add(new Wolf("Wolf" + i));
            } else {
                animals.add(new Fox("Fox" + i));
            }
        }
    }

    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.printAllAnimals();
    }
}
