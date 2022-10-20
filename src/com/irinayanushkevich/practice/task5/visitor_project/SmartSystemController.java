package com.irinayanushkevich.practice.task5.visitor_project;

public class SmartSystemController implements User {
    @Override
    public void switchLightOnOff(LightElement lightElement) {
        System.out.println("Switch the light on/off according to the set schedule or by voice command: automatically");
    }

    @Override
    public void switchHumidifierOnOff(AirHumidifierElement airHumidifierElement) {
        System.out.println("Switch the air humidifier on/off according to the set schedule, " +
                "by voice command or when the water has evaporated: automatically");
    }

    @Override
    public void openCloseGarage(GarageElement garageElement) {
        System.out.println("Opening/closing the garage according to the set schedule, by voice command: automatically");
    }
}
