package com.irinayanushkevich.practice.task5.creational.factory_project;

import com.irinayanushkevich.practice.task5.creational.factory_project.Animal;
import com.irinayanushkevich.practice.task5.creational.factory_project.AnimalFactory;
import com.irinayanushkevich.practice.task5.creational.factory_project.Dog;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
