package com.irinayanushkevich.practice.task5.creational.abstract_factory_project.cafe;

import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Manager;

public class CafeManager implements Manager {
    @Override
    public void manageCatering() {
        System.out.println("Manager of the cafe manages the cafe");
    }
}
