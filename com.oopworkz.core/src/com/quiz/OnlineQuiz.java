package com.quiz;

public class OnlineQuiz extends Quiz {
    public OnlineQuiz() {
        System.out.println("no-arg constructor of OnlineQuiz");
    }

    @Override
    public void start() {
        System.out.println("Running overridden start in OnlineQuiz");
    }

    void showTimer() {
        System.out.println("Running showTimer in OnlineQuiz");
    }
}
