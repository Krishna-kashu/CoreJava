package com.remainder;

public class Reminder{
    private String task;
    private String time;
    public Reminder() {
        System.out.println("no-arg constructor of Reminder");
    }

    public void alert() {
        System.out.println("Running alert() in Reminder");
    }
    public void setTask(String task) {
        this.task = task;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Reminder(Reminder ref) {
        this.task = ref.task;
        this.time = ref.time;
    }

    @Override
    public String toString() {
        return "Task: " + task + ", Time: " + time;
    }

}
