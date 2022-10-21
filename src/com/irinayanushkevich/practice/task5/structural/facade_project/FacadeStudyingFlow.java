package com.irinayanushkevich.practice.task5.structural.facade_project;

public class FacadeStudyingFlow {

    Student student = new Student();
    Homework homework = new Homework();
    HomeworkStatus homeworkStatus = new HomeworkStatus();

    public void beginProcess() {
        homework.prepare();
        homeworkStatus.beginStudy();
        student.doHomeworkIfHave(homeworkStatus);
    }
}
