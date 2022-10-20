package com.irinayanushkevich.practice.task5.bridge_project;

public abstract class Lesson {

    protected Teacher teacher;

    protected Lesson(Teacher teacher) {
        this.teacher = teacher;
    }

    public abstract void giveKnowledge();
}
