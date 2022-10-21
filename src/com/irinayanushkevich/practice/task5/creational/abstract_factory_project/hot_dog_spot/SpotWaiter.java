package com.irinayanushkevich.practice.task5.creational.abstract_factory_project.hot_dog_spot;

import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Waiter;

public class SpotWaiter implements Waiter {
    @Override
    public void serveVisitor() {
        System.out.println("Waiter of the hot-dog spot serves its visitors");
    }
}
