package com.irinayanushkevich.practice.task5.creational.factory_project;

import com.irinayanushkevich.practice.task5.creational.factory_project.Animal;

public class Dog implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Dog says Woof-woof");
    }
}
