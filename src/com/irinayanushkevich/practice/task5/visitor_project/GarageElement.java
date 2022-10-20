package com.irinayanushkevich.practice.task5.visitor_project;

public class GarageElement implements SmartHomeSystemElement {
    @Override
    public void controlElement(User user) {
        user.openCloseGarage(this);
    }
}
