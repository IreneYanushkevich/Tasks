package com.irinayanushkevich.practice.task5.structural.iterator_project;

public class WishList implements Collection {

    private String party;
    private String[] presents;

    public WishList(String party, String[] presents) {
        this.party = party;
        this.presents = presents;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String[] getPresents() {
        return presents;
    }

    public void setPresents(String[] presents) {
        this.presents = presents;
    }

    @Override
    public Iterator getIterator() {
        return new PresentIterator();
    }

    private class PresentIterator implements Iterator {
        int index;


        @Override
        public boolean hasNext() {
            if (index < presents.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return presents[index++];
        }
    }
}
