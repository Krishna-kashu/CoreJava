package com.quiz;

public class quizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.start();

        Quiz quiz1 = new OnlineQuiz();
        quiz1.start();

        System.out.println("**********");

        OnlineQuiz tq = new OnlineQuiz();
        tq.start();
        tq.showTimer();
    }
}
