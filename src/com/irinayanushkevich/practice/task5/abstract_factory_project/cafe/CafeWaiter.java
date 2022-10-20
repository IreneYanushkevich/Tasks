package com.irinayanushkevich.practice.task5.abstract_factory_project.cafe;

import com.irinayanushkevich.practice.task5.abstract_factory_project.Waiter;

public class CafeWaiter implements Waiter {
    @Override
    public void serveVisitor() {
        System.out.println("Waiter of the cafe serves visitors of the cafe brilliantly");
    }
}
