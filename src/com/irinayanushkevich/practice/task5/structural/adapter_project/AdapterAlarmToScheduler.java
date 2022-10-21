package com.irinayanushkevich.practice.task5.structural.adapter_project;

public class AdapterAlarmToScheduler extends AlarmClock implements Scheduler {

    @Override
    public void create() {
        setAlarm();
    }

    @Override
    public void read() {
        checkAlarmTime();
    }

    @Override
    public void update() {
        editAlarmTime();
    }

    @Override
    public void delete() {
        deleteAlarm();
    }
}
