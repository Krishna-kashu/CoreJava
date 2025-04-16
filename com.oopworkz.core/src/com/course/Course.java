package com.course;

public class Course {
    private String courseName;
    private int courseDuration;
    public Course() {
        System.out.println("no-arg constructor of Course");
    }

    public void enroll() {
        System.out.println("Running enroll() in Course");
    }


    public Course(String courseName, int courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        System.out.println("String, int constructor of Course");
    }

    public Course(Course ref) {
        this.courseName = ref.courseName;
        this.courseDuration = ref.courseDuration;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName + ", Duration: " + courseDuration + " weeks";
    }

}
