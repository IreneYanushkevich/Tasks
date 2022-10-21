package com.irinayanushkevich.practice.task5.behavioral.template_method_project;

public abstract class AdvertisingTemplate {

    public void createAdvertising() {
        System.out.println("Writing script");
        System.out.println("Preparing advertising product");
        runningAds();
        System.out.println("=====================================");
    }

    public abstract void runningAds();
}
