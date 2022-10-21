package com.irinayanushkevich.practice.task5.structural.template_method_project;

public class AdsRunner {

    public static void main(String[] args) {

        AdvertisingTemplate radioAds = new RadioAds();
        AdvertisingTemplate tvAds = new TelevisionAds();

        radioAds.createAdvertising();
        tvAds.createAdvertising();
    }
}
