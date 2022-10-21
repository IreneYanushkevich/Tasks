package com.irinayanushkevich.practice.task5.creational.abstract_factory_project;

public interface CateringTeamFactory {
    Manager getManager();
    Cook getCook();
    Waiter getWaiter();
}
