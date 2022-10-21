package com.irinayanushkevich.practice.task5.structural.command_project;

public class SendCommand implements Command {

    Message message;

    public SendCommand(Message message) {
        this.message = message;
    }

    @Override
    public void action() {
        message.send();
    }
}
