package com.irinayanushkevich.practice.task5.behavioral.command_project;

public class MessageRunner {

    public static void main(String[] args) {

        Message message = new Message();

        User user = new User(
                new SendCommand(message),
                new ReceiveCommand(message),
                new DeleteCommand(message),
                new FindCommand(message)
        );

        user.sendMessage();
        user.receiveMessage();
        user.deleteMessage();
        user.findMessage();
    }
}
