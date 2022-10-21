package com.irinayanushkevich.practice.task5.structural.visitor_project;

public class SmartHomeSystem implements SmartHomeSystemElement {

    SmartHomeSystemElement[] smartHomeSystemElements;

    public SmartHomeSystem() {
        this.smartHomeSystemElements = new SmartHomeSystemElement[]{
                new LightElement(),
                new AirHumidifierElement(),
                new GarageElement()
        };
    }

    @Override
    public void controlElement(User user) {
        for (SmartHomeSystemElement element : smartHomeSystemElements) {
            element.controlElement(user);
        }
    }
}
