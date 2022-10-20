package com.irinayanushkevich.practice.task5.factory_project;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
