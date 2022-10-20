package com.irinayanushkevich.practice.task5.factory_project;

public class MouseFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Mouse();
    }
}
