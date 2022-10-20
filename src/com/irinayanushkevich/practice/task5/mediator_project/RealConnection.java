package com.irinayanushkevich.practice.task5.mediator_project;

import java.util.ArrayList;
import java.util.List;

public class RealConnection implements Connection {

    Caller operator;
    List<Caller> callers = new ArrayList<>();

    public void setOperator(Caller operator) {
        this.operator = operator;
    }

    public void addCallerToConnection(Caller caller) {
        this.callers.add(caller);
    }

    @Override
    public void connect(String speech, Caller caller) {
        operator.answerCall(speech);
        for (Caller c : callers) {
            if (c != caller) {
                c.answerCall(speech);
            }
        }
    }
}
