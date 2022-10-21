package com.irinayanushkevich.practice.task5.behavioral.command_project;

public class FindCommand implements Command {

    Message message;

    public FindCommand(Message message) {
        this.message = message;
    }

    @Override
    public void action() {
        message.find();
    }
}
