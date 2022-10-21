package com.irinayanushkevich.practice.task5.behavioral.strategy_project;

public class DeveloperRunner {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.setAction(new MakingCoffee());
        coffeeMachine.startAction();

        coffeeMachine.setAction(new MakingCacao());
        coffeeMachine.startAction();

        coffeeMachine.setAction(new MakingBlackTee());
        coffeeMachine.startAction();

        coffeeMachine.setAction(new MakingGreenTee());
        coffeeMachine.startAction();
    }
}
