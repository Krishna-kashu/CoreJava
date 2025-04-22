package com.abstractWork.internal;

public abstract class Project {

    public Project() {
        System.out.println("No-arg constructor of Projects");
    }

    public void plan() {
        System.out.println("Running plan in Projects");
    }

    public void execute() {
        System.out.println("Running execute in Projects");
    }

    public void monitor() {
        System.out.println("Running monitor in Projects");
    }

    public void complete() {
        System.out.println("Running complete in Projects");
    }

    public void review() {
        System.out.println("Running review in Projects");
    }
}
