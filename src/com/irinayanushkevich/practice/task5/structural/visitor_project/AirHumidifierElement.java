package com.irinayanushkevich.practice.task5.structural.visitor_project;

public class AirHumidifierElement implements SmartHomeSystemElement {
    @Override
    public void controlElement(User user) {
        user.switchHumidifierOnOff(this);
    }
}
