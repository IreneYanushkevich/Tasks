package com.irinayanushkevich.practice.task5.structural.proxy_project;

public class ProxyProgram implements Program {

    private String url;
    private RealProgram realProgram;

    public ProxyProgram(String url) {
        this.url = url;
    }

    @Override
    public void use() {
        if (realProgram == null) {
            realProgram = new RealProgram(url);
        }
        realProgram.use();
    }
}
