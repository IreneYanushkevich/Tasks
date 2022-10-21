package com.irinayanushkevich.practice.task5.structural.command_project;

public class Message {

    public void send() {
        System.out.println("Sending message");
    }

    public void receive() {
        System.out.println("Receiving message");
    }

    public void delete() {
        System.out.println("Deleting message");
    }

    public void find() {
        System.out.println("Finding message");
    }
}
