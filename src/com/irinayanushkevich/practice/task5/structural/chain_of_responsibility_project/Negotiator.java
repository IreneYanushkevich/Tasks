package com.irinayanushkevich.practice.task5.structural.chain_of_responsibility_project;

public abstract class Negotiator {

    private int levelOfDeal;
    private Negotiator nextNegotiator;

    public Negotiator(int levelOfDeal) {
        this.levelOfDeal = levelOfDeal;
    }

    public void setNextNegotiator(Negotiator nextNegotiator) {
        this.nextNegotiator = nextNegotiator;
    }

    public void negotiate(String deal, int level) {
        if (level >= levelOfDeal) {
            signContract(deal);
        }
        if (nextNegotiator != null) {
            nextNegotiator.negotiate(deal, level);
        }
    }

    public abstract void signContract(String deal);
}
