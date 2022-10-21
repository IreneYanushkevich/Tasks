package com.irinayanushkevich.practice.task3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

public class Foo4 {

    private final Semaphore s1 = new Semaphore(0);
    private final Semaphore s2 = new Semaphore(0);

    public void first(Runnable r) {
       r.run();
       s1.release();
        Thread.interrupted();
    }

    public void second(Runnable r) throws InterruptedException {
            s1.acquire();
            r.run();
            s2.release();
    }

    public void third(Runnable r) throws InterruptedException {
        s2.acquire();
        r.run();
    }
}