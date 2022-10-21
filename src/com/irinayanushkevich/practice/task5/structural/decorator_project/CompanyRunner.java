package com.irinayanushkevich.practice.task5.structural.decorator_project;

public class CompanyRunner {

    public static void main(String[] args) {

        Employee employee = new Director(new Manager(new Worker()));
        System.out.println(employee.doWork());
    }
}
