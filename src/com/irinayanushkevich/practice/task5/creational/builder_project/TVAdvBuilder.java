package com.irinayanushkevich.practice.task5.creational.builder_project;

public class TVAdvBuilder extends AdvertisingBuilder {
    @Override
    void buildName() {
        advertising.setName("Advertising on the TV");
    }

    @Override
    void buildPrice() {
        advertising.setPrice(800);
    }
}
