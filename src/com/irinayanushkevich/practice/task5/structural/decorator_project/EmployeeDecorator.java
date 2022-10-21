package com.irinayanushkevich.practice.task5.structural.decorator_project;

public class EmployeeDecorator implements Employee {

    Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String doWork() {
        return employee.doWork();
    }
}
