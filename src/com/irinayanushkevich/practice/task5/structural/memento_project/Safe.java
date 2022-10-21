package com.irinayanushkevich.practice.task5.structural.memento_project;

import java.util.Date;

public class Safe {

    private final String version;
    private final Date date;

    public Safe(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }

}
