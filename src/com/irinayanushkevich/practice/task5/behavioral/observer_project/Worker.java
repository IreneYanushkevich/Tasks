package com.irinayanushkevich.practice.task5.behavioral.observer_project;

import java.util.List;

public class Worker implements Observer {

    String position;

    public Worker(String position) {
        this.position = position;
    }

    @Override
    public void notify(List<String> goods) {
        System.out.println("\nDear " + position + ", the list of goods in the warehouse has been updated:\n" + goods);
    }
}
