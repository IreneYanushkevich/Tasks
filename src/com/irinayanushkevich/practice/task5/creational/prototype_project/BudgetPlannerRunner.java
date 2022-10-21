package com.irinayanushkevich.practice.task5.creational.prototype_project;

public class BudgetPlannerRunner {

    public static void main(String[] args) {

        Budget budget = new Budget("development", 10000, 90);
        System.out.println(budget);
        BudgetFactory factory = new BudgetFactory(budget);
        Budget budgetCopy = factory.cloneBudget();
        System.out.println(budgetCopy);
    }
}
