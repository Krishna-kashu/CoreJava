package com.quiz;

public class Quiz {
    private String topic;
    private int totalQuestions;
    public Quiz() {
        System.out.println("no-arg constructor of Quiz");
    }

    public void start() {
        System.out.println("Running start in Quiz");
    }


    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public Quiz(Quiz ref) {
        this.topic = ref.topic;
        this.totalQuestions = ref.totalQuestions;
    }

    @Override
    public String toString() {
        return "Topic: " + topic + ", Questions: " + totalQuestions;
    }

}
