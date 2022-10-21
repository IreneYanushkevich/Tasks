package com.irinayanushkevich.practice.task5.behavioral.facade_project;

public class FacadeStudyingFlow {

    Student student = new Student();
    Homework homework = new Homework();
    HomeworkStatus homeworkStatus = new HomeworkStatus();

    public void study() {
        homework.doHomework();
        homeworkStatus.beginStudy();
        student.doHomeworkIfHave(homeworkStatus);
    }
}
