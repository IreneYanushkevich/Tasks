package com.irinayanushkevich.practice.task5.strategy_project;

public class CoffeeMachine {

    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void startAction() {
        action.act();
    }
}
