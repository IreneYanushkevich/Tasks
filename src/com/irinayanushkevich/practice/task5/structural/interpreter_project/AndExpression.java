package com.irinayanushkevich.practice.task5.structural.interpreter_project;

public class AndExpression implements Expression {

    private Expression first;
    private Expression second;

    public AndExpression(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean interpret(String context) {
        return first.interpret(context) && second.interpret(context);
    }
}
