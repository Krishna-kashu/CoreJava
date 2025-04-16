package com.lesson;

public class Lesson {
    private String subject;
    private int durationMinutes;
        public Lesson() {
            System.out.println("no-arg constructor of Lesson");
        }

        public void teach() {
            System.out.println("Running teach() in Lesson");
        }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public Lesson(Lesson ref) {
        this.subject = ref.subject;
        this.durationMinutes = ref.durationMinutes;
    }

    @Override
    public String toString() {
        return "Subject: " + subject + ", Duration: " + durationMinutes + " minutes";
    }

}
