package com.irinayanushkevich.practice.task5.strategy_project;

public class MakingGreenTee implements Action {
    @Override
    public void act() {
        System.out.println("Your green tea is ready!");
    }
}