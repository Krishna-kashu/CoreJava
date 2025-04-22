package com.abstractWork.internal;

public abstract class Job {

    public Job() {
        System.out.println("No-arg constructor of Job");
    }

    public void apply() {
        System.out.println("Running apply in Job");
    }

    public void interview() {
        System.out.println("Running interview in Job");
    }

    public void getOffer() {
        System.out.println("Running getOffer in Job");
    }

    public void start() {
        System.out.println("Running start in Job");
    }

    public void resign() {
        System.out.println("Running resign in Job");
    }
}
