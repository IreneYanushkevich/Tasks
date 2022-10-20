package com.irinayanushkevich.practice.task5.facade_project;

public class Student {

    public void doHomeworkIfHave(HomeworkStatus homeworkStatus) {
        if (homeworkStatus.haveHomework()) {
            System.out.println("Student is doing his homework. ");
        } else {
            System.out.println("Student is playing football. ");
        }
    }
}
