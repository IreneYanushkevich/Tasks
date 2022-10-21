package com.irinayanushkevich.practice.task5.structural.chain_of_responsibility_project;

public class MajorNegotiator extends Negotiator {

    public MajorNegotiator(int level) {
        super(level);
    }

    @Override
    public void signContract(String deal) {
        System.out.println("Negotiator is negotiating with founder: " + deal);
    }
}
