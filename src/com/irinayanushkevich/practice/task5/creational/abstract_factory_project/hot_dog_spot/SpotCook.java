package com.irinayanushkevich.practice.task5.creational.abstract_factory_project.hot_dog_spot;

import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Cook;

public class SpotCook implements Cook {
    @Override
    public void cookFood() {
        System.out.println("Cook of the spot makes hot-dogs only");
    }
}
