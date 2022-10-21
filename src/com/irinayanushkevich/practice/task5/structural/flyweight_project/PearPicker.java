package com.irinayanushkevich.practice.task5.structural.flyweight_project;

public class PearPicker implements HarvestPicker {
    @Override
    public void harvest() {
        System.out.println("Pears picker is peaking pears.");
    }
}
