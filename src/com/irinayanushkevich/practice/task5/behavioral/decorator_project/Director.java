package com.irinayanushkevich.practice.task5.behavioral.decorator_project;

public class Director extends EmployeeDecorator {

    public Director(Employee employee) {
        super(employee);
    }

    public String runCompany() {
        return "Run a company. ";
    }

    @Override
    public String doWork() {
        return super.doWork() + runCompany();
    }
}
