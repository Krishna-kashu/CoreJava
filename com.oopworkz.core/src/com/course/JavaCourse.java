package com.course;

public class JavaCourse extends Course {
    public JavaCourse() {
        System.out.println("no-arg constructor of ProgrammingCourse");
    }

    @Override
    public void enroll() {
        System.out.println("Running overridden enroll() in ProgrammingCourse");
    }

    void assignProject() {
        System.out.println("Running assignProject() in ProgrammingCourse");
    }
}
