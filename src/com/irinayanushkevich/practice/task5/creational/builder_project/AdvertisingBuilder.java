package com.irinayanushkevich.practice.task5.creational.builder_project;

public abstract class AdvertisingBuilder {

    Advertising advertising;

    void createAdvertising() {
        advertising = new Advertising();
    }

    abstract void buildName();

    abstract void buildPrice();

    Advertising getAdvertising() {
        return advertising;
    }
}
