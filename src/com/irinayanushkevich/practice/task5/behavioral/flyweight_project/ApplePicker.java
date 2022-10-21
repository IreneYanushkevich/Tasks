package com.irinayanushkevich.practice.task5.behavioral.flyweight_project;

public class ApplePicker implements HarvestPicker {
    @Override
    public void harvest() {
        System.out.println("Apples picker is peaking apples. ");
    }
}
