package com.irinayanushkevich.practice.task5.decorator_project;

public class Manager extends EmployeeDecorator {

    public Manager(Employee employee) {
        super(employee);
    }

    public String manage() {
        return "Manage workers. ";
    }

    @Override
    public String doWork() {
        return super.doWork() + manage();
    }
}
