package com.irinayanushkevich.practice.task5.behavioral.state_project;

public class CoffeeMachineRunner {

    public static void main(String[] args) {

        Action action = new AddCoffee();
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.setAction(action);

        for (int i = 0; i < 8; i++) {
            coffeeMachine.doThis();
            coffeeMachine.nextAction();
        }
    }
}
