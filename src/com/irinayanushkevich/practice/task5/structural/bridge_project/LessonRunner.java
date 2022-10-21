package com.irinayanushkevich.practice.task5.structural.bridge_project;

public class LessonRunner {

    public static void main(String[] args) {

        Lesson[] lessons = {
                new EnglishCourses(new Tutor()),
                new EnglishLesson(new EnglishTeacher())
        };

        for (Lesson lesson : lessons) {
            lesson.giveKnowledge();
        }
    }
}
