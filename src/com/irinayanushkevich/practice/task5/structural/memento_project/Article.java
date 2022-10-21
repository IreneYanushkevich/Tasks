package com.irinayanushkevich.practice.task5.structural.memento_project;

import java.util.Date;

public class Article {

    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public Safe safe() {
        return new Safe(version);
    }

    public void load(Safe safe) {
        version = safe.getVersion();
        date = safe.getDate();
    }

    public String toString() {
        return "Article: version - " + version + ", date - " + date + "\n";
    }
}
