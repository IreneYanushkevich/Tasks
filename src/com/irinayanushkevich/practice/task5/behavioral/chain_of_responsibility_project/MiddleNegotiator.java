package com.irinayanushkevich.practice.task5.behavioral.chain_of_responsibility_project;

public class MiddleNegotiator extends Negotiator {

    public MiddleNegotiator(int level) {
        super(level);
    }

    @Override
    public void signContract(String deal) {
        System.out.println("Negotiator is negotiating with director: " + deal);
    }
}
