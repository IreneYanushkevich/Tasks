package com.irinayanushkevich.practice.task5.behavioral.interpreter_project;

public class TerminalExpression implements Expression {

    private String word;

    public TerminalExpression(String word) {
        this.word = word;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(word)) {
            return true;
        }
        return false;
    }
}
