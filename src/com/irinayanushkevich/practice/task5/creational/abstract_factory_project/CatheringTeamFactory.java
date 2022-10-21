package com.irinayanushkevich.practice.task5.creational.abstract_factory_project;

public interface CatheringTeamFactory {
    Manager getManager();
    Cook getCook();
    Waiter getWaiter();
}
