package com.irinayanushkevich.practice.task5.behavioral.visitor_project;

public class SmartSystemRunner {

    public static void main(String[] args) {

        SmartHomeSystem smartHomeSystem = new SmartHomeSystem();

        User oldGrandmother = new SimpleUser();
        User advancedUser = new SmartSystemUser();

        System.out.println("Grandmother is alone at home");
        smartHomeSystem.controlElement(oldGrandmother);

        System.out.println("===========================================================================================");

        System.out.println("Grandson cameback home");
        smartHomeSystem.controlElement(advancedUser);
    }
}
