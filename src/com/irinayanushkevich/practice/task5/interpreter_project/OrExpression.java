package com.irinayanushkevich.practice.task5.interpreter_project;

public class OrExpression implements Expression {

    private Expression first;
    private Expression second;

    public OrExpression(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean interpret(String context) {
        return first.interpret(context) || second.interpret(context);
    }
}
