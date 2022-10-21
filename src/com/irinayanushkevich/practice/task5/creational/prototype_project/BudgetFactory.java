package com.irinayanushkevich.practice.task5.creational.prototype_project;

public class BudgetFactory {

    Budget budget;

    public BudgetFactory(Budget budget) {
        this.budget = budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    Budget cloneBudget() {
        return (Budget) budget.copy();
    }
}
