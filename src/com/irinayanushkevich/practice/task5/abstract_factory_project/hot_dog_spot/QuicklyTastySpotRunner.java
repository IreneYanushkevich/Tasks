package com.irinayanushkevich.practice.task5.abstract_factory_project.hot_dog_spot;

import com.irinayanushkevich.practice.task5.abstract_factory_project.CatheringTeamFactory;
import com.irinayanushkevich.practice.task5.abstract_factory_project.Cook;
import com.irinayanushkevich.practice.task5.abstract_factory_project.Manager;
import com.irinayanushkevich.practice.task5.abstract_factory_project.Waiter;

public class QuicklyTastySpotRunner {

    public static void main(String[] args) {

        CatheringTeamFactory factory = new SpotTeamFactory();
        Manager manager = factory.getManager();
        Cook cook = factory.getCook();
        Waiter waiter = factory.getWaiter();
        System.out.println("What our team makes every day:");
        manager.manageCatering();
        cook.cookFood();
        waiter.serveVisitor();
    }
}
