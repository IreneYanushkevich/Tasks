package com.irinayanushkevich.practice.task5.proxy_project;

public class ProgramRunner {

    public static void main(String[] args) {

        Program program = new ProxyProgram("https://www.viber.com");
        program.use();
    }
}
