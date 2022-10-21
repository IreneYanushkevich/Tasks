package com.irinayanushkevich.practice.task5.creational.abstract_factory_project.hot_dog_spot;

import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Cook;
import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.CateringTeamFactory;
import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Manager;
import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Waiter;

public class SpotTeamFactory implements CateringTeamFactory {
    @Override
    public Manager getManager() {
        return new SpotManager();
    }

    @Override
    public Cook getCook() {
        return new SpotCook();
    }

    @Override
    public Waiter getWaiter() {
        return new SpotWaiter();
    }
}
