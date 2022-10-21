package com.irinayanushkevich.practice.task5.creational.prototype_project;

public class Budget implements Copyable {

    private String purpose;
    private int volume;
    private int termDays;


    public Budget(String purpose, int volume, int termDays) {
        this.purpose = purpose;
        this.volume = volume;
        this.termDays = termDays;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getVolume() {
        return volume;
    }

    public void setValue(int volume) {
        this.volume = volume;
    }

    public int getTerm() {
        return termDays;
    }

    public void setTerm(int termDays) {
        this.termDays = termDays;
    }

    @Override
    public String toString() {
        return "Budget for " + purpose + ", volume: " + volume + ", for the term: " + termDays + "\n";
    }

    @Override
    public Object copy() {
        return new Budget(purpose, volume, termDays);
    }
}
