package com.irinayanushkevich.practice.task5.observer_project;

public class InventoryReportRunner {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        warehouse.addGood("blue jeans");
        warehouse.addGood("black T-shirts");

        Observer manager = new Worker("manager");
        Observer accountant = new Worker("accountant");

        warehouse.addObserver(manager);
        warehouse.addObserver(accountant);
        warehouse.addGood("White dresses");
        warehouse.removeGood("blue jeans");
    }
}
