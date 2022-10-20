package com.irinayanushkevich.practice.task5.factory_project;

public class Dog implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Dog says Woof-woof");
    }
}
