package com.irinayanushkevich.practice.task5.structural.bridge_project;

public class EnglishCourses extends Lesson {

    protected EnglishCourses(Teacher teacher) {
        super(teacher);
    }
    @Override
    public void giveKnowledge() {
        System.out.println("English courses gives deep knowledge to students");
        teacher.teach();
    }
}
