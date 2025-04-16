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

        Quiz q1 = new Quiz();
        q1.setTopic("Java");
        q1.setTotalQuestions(10);
        Quiz q2 = new Quiz(q1);
        System.out.println(q2);

    }
}
