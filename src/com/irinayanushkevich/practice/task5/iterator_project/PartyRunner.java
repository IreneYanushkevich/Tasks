package com.irinayanushkevich.practice.task5.iterator_project;

public class PartyRunner {

    public static void main(String[] args) {

        String[] presents = {"Flowers", "Cake", "iPhone", "Picture"};

        WishList wishList = new WishList("B-Day", presents);

        Iterator iterator = wishList.getIterator();
        System.out.println("Wish list for the party ~" + wishList.getParty() + "~");

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
