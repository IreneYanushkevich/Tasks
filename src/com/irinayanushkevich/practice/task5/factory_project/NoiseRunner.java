package com.irinayanushkevich.practice.task5.factory_project;

public class NoiseRunner {

    public static void main(String[] args) {
        AnimalFactory factory = createAnimalByName("mouse");
        Animal animal = factory.createAnimal();
        animal.makeNoise();
    }

    public static AnimalFactory createAnimalByName(String name) {
        if (name.equalsIgnoreCase("dog")) {
            return new DogFactory();
        } else if (name.equalsIgnoreCase("cat")) {
            return new CatFactory();
        } else if (name.equalsIgnoreCase("mouse")) {
            return new MouseFactory();
        } else {
            throw new RuntimeException(name + " is unavailable");
        }
    }
}
