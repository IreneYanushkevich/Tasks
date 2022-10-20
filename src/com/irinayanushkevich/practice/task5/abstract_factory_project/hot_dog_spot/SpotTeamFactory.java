package com.irinayanushkevich.practice.task5.abstract_factory_project.hot_dog_spot;

import com.irinayanushkevich.practice.task5.abstract_factory_project.Cook;
import com.irinayanushkevich.practice.task5.abstract_factory_project.CatheringTeamFactory;
import com.irinayanushkevich.practice.task5.abstract_factory_project.Manager;
import com.irinayanushkevich.practice.task5.abstract_factory_project.Waiter;
import com.irinayanushkevich.practice.task5.abstract_factory_project.cafe.CafeManager;

public class SpotTeamFactory implements CatheringTeamFactory {
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
