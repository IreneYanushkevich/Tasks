package com.irinayanushkevich.practice.task5.flyweight;

public class ApplePicker implements HarvestPicker {
    @Override
    public void harvest() {
        System.out.println("Apples picker is peaking apples.");
    }
}
