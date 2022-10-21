package com.irinayanushkevich.practice.task5.structural.visitor_project;

public class Human implements User {


    @Override
    public void switchLightOnOff(LightElement lightElement) {
        System.out.println("Switching the light on when it is really needed and off only if it is not forgotten: manually");
    }

    @Override
    public void switchHumidifierOnOff(AirHumidifierElement airHumidifierElement) {
        System.out.println("Switching the air humidifier on/off when not lazy: manually");
    }

    @Override
    public void openCloseGarage(GarageElement garageElement) {
        System.out.println("Opening/closing the garage when somebody arrives or leaves: manually");
    }
}
