package com.irinayanushkevich.practice.task5.structural.visitor_project;

public class GarageElement implements SmartHomeSystemElement {
    @Override
    public void controlElement(User user) {
        user.openCloseGarage(this);
    }
}
