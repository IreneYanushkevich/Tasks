package com.irinayanushkevich.practice.task5.creational.abstract_factory_project.hot_dog_spot;

import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Manager;

public class SpotManager implements Manager {
    @Override
    public void manageCatering() {
        System.out.println("Manager of the hot-dog spot manages this spot");
    }
}
