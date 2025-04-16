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
        Course course2 = new Course("Java Programming", 6);
        Course course3 = new Course(course2);
        System.out.println(course3);

    }
}