package com.irinayanushkevich.practice.task5.facade_project;

public class HomeworkStatus {

    private boolean haveHomework;

    public boolean haveHomework() {
        return haveHomework;
    }

    public void beginStudy() {
        System.out.println("Student got his homework.");
        haveHomework = true;
    }

    public void finishStudy() {
        System.out.println("Student have not homework.");
        haveHomework = false;
    }
}
