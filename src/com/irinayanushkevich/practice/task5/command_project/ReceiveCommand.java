package com.irinayanushkevich.practice.task5.command_project;

public class ReceiveCommand implements Command {

    Message message;

    public ReceiveCommand(Message message) {
        this.message = message;
    }

    @Override
    public void action() {
        message.receive();
    }
}
