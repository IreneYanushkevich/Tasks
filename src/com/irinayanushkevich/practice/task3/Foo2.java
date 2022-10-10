package com.irinayanushkevich.practice.task3;

import java.util.concurrent.Phaser;

public class Foo2 {
    private final Phaser phaser = new Phaser(3);

    public void first(Runnable r) throws InterruptedException {
        phaser.arrive();
        phaser.awaitAdvance(0);
        r.run();
        phaser.arrive();
        phaser.arrive();
    }

    public void second(Runnable r) throws InterruptedException {
        phaser.arrive();
        phaser.awaitAdvance(0);
        phaser.arrive();
        phaser.awaitAdvance(1);
        r.run();
        phaser.arrive();
    }

    public void third(Runnable r) throws InterruptedException {
        phaser.arrive();
        phaser.awaitAdvance(0);
        phaser.arrive();
        phaser.awaitAdvance(1);
        phaser.arrive();
        phaser.awaitAdvance(2);
        r.run();
    }
}
