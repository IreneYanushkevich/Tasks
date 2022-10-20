package com.irinayanushkevich.practice.task5.builder_project;

public class AdvertisingAgency {

    AdvertisingBuilder builder;

    public void setBuilder(AdvertisingBuilder builder) {
        this.builder = builder;
    }

    Advertising buildAdvertising() {
        builder.createAdvertising();
        builder.buildName();
        builder.buildPrice();
        Advertising advertising = builder.getAdvertising();
        return advertising;
    }
}
