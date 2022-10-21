package com.irinayanushkevich.practice.task5.creational.abstract_factory_project.cafe;

import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Cook;
import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.CateringTeamFactory;
import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Manager;
import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Waiter;

public class CafeTeamFactory implements CateringTeamFactory {
    @Override
    public Manager getManager() {
        return new CafeManager();
    }

    @Override
    public Cook getCook() {
        return new CafeChief();
    }

    @Override
    public Waiter getWaiter() {
        return new CafeWaiter();
    }
}
