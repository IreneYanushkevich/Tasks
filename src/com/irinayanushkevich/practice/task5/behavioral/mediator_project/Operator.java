package com.irinayanushkevich.practice.task5.behavioral.mediator_project;

public class Operator implements Caller {
    Connection connection;
    String name;

    public Operator(Connection connection, String name) {
        this.connection = connection;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect(String speech) {
        connection.connect(speech,this);
    }

    @Override
    public void answerCall(String speech) {
        System.out.println(this.name + " supports speech: " + speech);
    }
}
