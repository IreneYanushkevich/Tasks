package com.irinayanushkevich.practice.task5.structural.chain_of_responsibility_project;

public class SmallNegotiator extends Negotiator {

    public SmallNegotiator(int level) {
        super(level);
    }

    @Override
    public void signContract(String deal) {
        System.out.println("Negotiator is negotiating with sales manager: " + deal);
    }
}
