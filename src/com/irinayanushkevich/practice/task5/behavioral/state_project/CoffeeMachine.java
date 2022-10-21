package com.irinayanushkevich.practice.task5.behavioral.state_project;

public class CoffeeMachine {

    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void nextAction() {
        if (action instanceof AddCoffee) {
            setAction(new AddSugar());
        } else if (action instanceof AddSugar) {
            setAction(new AddWater());
        } else if (action instanceof AddWater) {
            setAction(new AddMilk());
        } else if (action instanceof AddMilk) {
            setAction(new AddCoffee());
        }
    }

    public void doThis() {
        action.doThis();
    }
}
