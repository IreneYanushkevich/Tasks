package com.irinayanushkevich.practice.task3.task3_1;

import java.util.concurrent.*;

public class Foo {

    private final CountDownLatch cdl = new CountDownLatch(2);

    public void first(Runnable r) throws InterruptedException {
        r.run();
        cdl.countDown();
    }

    public void second(Runnable r) throws InterruptedException {
        cdl.await(1000, TimeUnit.MILLISECONDS);
        r.run();
        cdl.countDown();
    }

    public void third(Runnable r) throws InterruptedException {
        cdl.await();
        r.run();
    }
}