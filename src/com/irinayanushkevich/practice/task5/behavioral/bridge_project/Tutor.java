package com.irinayanushkevich.practice.task5.behavioral.bridge_project;

public class Tutor implements Teacher {
    @Override
    public void teach() {
        System.out.println("Tutor teaches students");
    }
}
