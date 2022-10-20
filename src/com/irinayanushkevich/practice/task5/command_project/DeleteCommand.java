package com.irinayanushkevich.practice.task5.command_project;

public class DeleteCommand implements Command {

    Message message;

    public DeleteCommand(Message message) {
        this.message = message;
    }

    @Override
    public void action() {
        message.delete();
    }
}
