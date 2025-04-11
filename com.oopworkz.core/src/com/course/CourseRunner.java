package com.course;

public class CourseRunner {
    public static void main(String[] args) {
        Course course = new Course();
        course.enroll();

        Course course1 = new JavaCourse();
        course1.enroll();

        System.out.println("**********");

        JavaCourse pc = new JavaCourse();
        pc.enroll();
        pc.assignProject();
    }
}