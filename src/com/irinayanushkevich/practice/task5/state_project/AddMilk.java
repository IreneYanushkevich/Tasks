package com.irinayanushkevich.practice.task5.state_project;

public class AddMilk implements Action {
    @Override
    public void doThis() {
        System.out.println("Hot milk has been added. Your drink is ready!\n");
    }
}
