package com.irinayanushkevich.practice.task5.behavioral.adapter_project;

import com.irinayanushkevich.practice.task5.behavioral.adapter_project.AdapterAlarmToScheduler;
import com.irinayanushkevich.practice.task5.behavioral.adapter_project.Scheduler;

public class SchedulerRunner {

    public static void main(String[] args) {

        Scheduler scheduler = new AdapterAlarmToScheduler();
        scheduler.create();
        scheduler.read();
        scheduler.update();
        scheduler.delete();
    }
}
