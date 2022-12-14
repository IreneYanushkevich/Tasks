package com.irinayanushkevich.practice.task5.structural.bridge_project;

public class EnglishLesson extends Lesson {

    protected EnglishLesson(Teacher teacher) {
        super(teacher);
    }

    @Override
    public void giveKnowledge() {
        System.out.println("English lesson gives basic knowledge to students");
        teacher.teach();
    }
}
