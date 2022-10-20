package com.irinayanushkevich.practice.task5.factory_project;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
