package com.irinayanushkevich.practice.task5.structural.mediator_project;

public class RealConnectionRunner {

    public static void main(String[] args) {

        RealConnection connection = new RealConnection();

        Caller operator = new Operator(connection, "Velcom");
        Caller caller1 = new RealCaller(connection, "Ivan");
        Caller caller2 = new RealCaller(connection, "Oleg");

        connection.setOperator(operator);
        connection.addCallerToConnection(caller1);
        connection.addCallerToConnection(caller2);

        caller1.connect("Hi, Oleeeeeg!!");
        caller2.connect("Nice to hear you, Ivan!");
        operator.connect("Subscriber is out of mobile network coverage area");
    }
}
