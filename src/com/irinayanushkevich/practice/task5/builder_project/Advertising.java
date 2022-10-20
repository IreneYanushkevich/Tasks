package com.irinayanushkevich.practice.task5.builder_project;

public class Advertising {

    private String name;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return name + " costs " + price + "\n";
    }
}
