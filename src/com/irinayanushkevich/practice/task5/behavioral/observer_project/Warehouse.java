package com.irinayanushkevich.practice.task5.behavioral.observer_project;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements Observed {

    List<String> goods = new ArrayList<>();
    List<Observer> workers = new ArrayList<>();

    public void addGood(String good) {
        this.goods.add(good);
        notifyObservers();
    }

    public void removeGood(String good) {
        this.goods.remove(good);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.workers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.workers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : workers) {
            observer.notify(this.goods);
        }
    }
}
