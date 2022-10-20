package com.irinayanushkevich.practice.task5.visitor_project;

public class LightElement implements SmartHomeSystemElement {
    @Override
    public void controlElement(User user) {
        user.switchLightOnOff(this);
    }
}
