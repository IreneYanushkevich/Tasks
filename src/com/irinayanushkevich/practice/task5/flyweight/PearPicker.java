package com.irinayanushkevich.practice.task5.flyweight;

public class PearPicker implements HarvestPicker {
    @Override
    public void harvest() {
        System.out.println("Pears picker is peaking pears.");
    }
}
