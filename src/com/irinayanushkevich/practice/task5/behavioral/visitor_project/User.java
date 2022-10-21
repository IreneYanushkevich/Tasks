package com.irinayanushkevich.practice.task5.behavioral.visitor_project;

public interface User {
    public void switchLightOnOff(LightElement lightElement);
    public void switchHumidifierOnOff(AirHumidifierElement airHumidifierElement);
    public void openCloseGarage(GarageElement garageElement);
}
