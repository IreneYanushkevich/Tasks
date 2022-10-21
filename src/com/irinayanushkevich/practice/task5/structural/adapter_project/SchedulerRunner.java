package com.irinayanushkevich.practice.task5.structural.adapter_project;

public class SchedulerRunner {

    public static void main(String[] args) {

        Scheduler scheduler = new AdapterAlarmToScheduler();
        scheduler.create();
        scheduler.read();
        scheduler.update();
        scheduler.delete();
    }
}
