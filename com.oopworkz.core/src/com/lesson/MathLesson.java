package com.lesson;

public class MathLesson extends Lesson {
        public MathLesson() {
            System.out.println("no-arg constructor of MathLesson");
        }

        @Override
        public void teach() {
            System.out.println("Running overridden teach() in MathLesson");
        }

        void solveEquation() {
            System.out.println("Running solveEquation() in MathLesson");
        }
}
