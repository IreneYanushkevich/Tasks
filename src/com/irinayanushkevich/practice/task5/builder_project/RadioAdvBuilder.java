package com.irinayanushkevich.practice.task5.builder_project;

public class RadioAdvBuilder extends AdvertisingBuilder {

    @Override
    void buildName() {
        advertising.setName("Advertising on the radio");
    }

    @Override
    void buildPrice() {
        advertising.setPrice(100);
    }
}
