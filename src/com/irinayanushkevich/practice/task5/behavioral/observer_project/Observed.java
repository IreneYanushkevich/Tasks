package com.irinayanushkevich.practice.task5.behavioral.observer_project;

public interface Observed {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
