package com.irinayanushkevich.practice.task5.creational.abstract_factory_project.cafe;

import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Cook;
import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.CatheringTeamFactory;
import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Manager;
import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Waiter;

public class CafeMatterOfTasteRunner {

    public static void main(String[] args) {

        CatheringTeamFactory factory = new CafeTeamFactory();
        Manager manager = factory.getManager();
        Cook cook = factory.getCook();
        Waiter waiter = factory.getWaiter();
        System.out.println("What our team makes every day:");
        manager.manageCatering();
        cook.cookFood();
        waiter.serveVisitor();
    }
}
