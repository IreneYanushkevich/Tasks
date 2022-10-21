package com.irinayanushkevich.practice.task5.behavioral.visitor_project;

public class AirHumidifierElement implements SmartHomeSystemElement {
    @Override
    public void controlElement(User user) {
        user.switchHumidifierOnOff(this);
    }
}
