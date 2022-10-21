package com.irinayanushkevich.practice.task5.structural.proxy_project;

public class ProgramRunner {

    public static void main(String[] args) {

        Program program = new ProxyProgram("https://www.viber.com");
        program.use();
    }
}
