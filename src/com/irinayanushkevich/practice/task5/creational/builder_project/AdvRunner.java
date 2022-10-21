package com.irinayanushkevich.practice.task5.creational.builder_project;

public class AdvRunner {

    public static void main(String[] args) {

        AdvertisingAgency agency = new AdvertisingAgency();
        agency.setBuilder(new TVAdvBuilder());
        Advertising advertising = agency.buildAdvertising();
        System.out.println(advertising);
    }
}
