package com.irinayanushkevich.practice.task5.command_project;

public class User {

    Command send;
    Command receive;
    Command delete;
    Command find;

    public User(Command send, Command receive, Command delete, Command find) {
        this.send = send;
        this.receive = receive;
        this.delete = delete;
        this.find = find;
    }

    public void sendMessage() {
        send.action();
    }

    public void receiveMessage() {
        receive.action();
    }

    public void deleteMessage() {
        delete.action();
    }

    public void findMessage() {
        find.action();
    }
}
