package com.irinayanushkevich.practice.task5.behavioral.proxy_project;

public class RealProgram implements Program {

    private String url;

    public RealProgram(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading program from " + url);
    }

    @Override
    public void use() {
        System.out.println("Using program from " + url);
    }
}
