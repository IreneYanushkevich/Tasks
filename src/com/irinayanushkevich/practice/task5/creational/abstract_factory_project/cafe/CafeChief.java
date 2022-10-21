package com.irinayanushkevich.practice.task5.creational.abstract_factory_project.cafe;

import com.irinayanushkevich.practice.task5.creational.abstract_factory_project.Cook;

public class CafeChief implements Cook {
    @Override
    public void cookFood() {
        System.out.println("Chief makes gourmet dishes");
    }
}
