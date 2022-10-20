package com.irinayanushkevich.practice.task5.chain_of_responsibility_project;

public class DealRunner {

    public static void main(String[] args) {

        Negotiator small = new SmallNegotiator(DealLevel.SMALL_DEAL);
        Negotiator middle = new MiddleNegotiator(DealLevel.MIDDLE_DEAL);
        Negotiator major = new MajorNegotiator(DealLevel.MAJOR_DEAL);

        small.setNextNegotiator(middle);
        middle.setNextNegotiator(major);

        small.negotiate("Let's sign contract for 100 $! ", DealLevel.SMALL_DEAL);
        small.negotiate("Let's sign contract for 5000 $! ", DealLevel.MIDDLE_DEAL);
        small.negotiate("Let's sign contract for 10000000000 $! ", DealLevel.MAJOR_DEAL);
    }
}
