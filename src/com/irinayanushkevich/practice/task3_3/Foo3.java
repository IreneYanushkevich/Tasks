package com.irinayanushkevich.practice.task3_3;

public class Foo3 {

    public int count;

    public Foo3() {
        this.count = 1;
    }

    synchronized public void first(Runnable r) throws InterruptedException {
        while (count != 1) {
            wait();
        }
        r.run();
        count++;
        notifyAll();
    }

    synchronized public void second(Runnable r) throws InterruptedException {
        while (count != 2) {
            wait();
        }
        r.run();
        count++;
        notifyAll();
    }

    synchronized public void third(Runnable r) throws InterruptedException {
        while (count != 3) {
            wait();
        }
        r.run();
        count++;
        notifyAll();
    }
}
