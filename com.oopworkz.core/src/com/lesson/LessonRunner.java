package com.lesson;

public class LessonRunner {
    public static void main(String[] args) {
        Lesson lesson= new Lesson();
        lesson.teach();

        Lesson lesson1 = new MathLesson();
        lesson1.teach();

        System.out.println("**********");

        MathLesson math = new MathLesson();
        math.teach();
        math.solveEquation();

        Lesson lesson2 = new Lesson();
        lesson2.setSubject("Mathematics");
        lesson2.setDurationMinutes(60);

        Lesson lesson3 = new Lesson(lesson2);
        System.out.println(lesson3);
    }
}
