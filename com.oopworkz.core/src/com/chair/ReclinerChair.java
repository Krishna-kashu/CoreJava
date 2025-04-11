package com.chair;

public class ReclinerChair  extends Chair {
    public ReclinerChair() {
        System.out.println("no-arg constructor of ReclinerChair");
    }

    @Override
    public void sit() {
        System.out.println("Running overridden sit() in ReclinerChair");
    }

    void recline() {
        System.out.println("Running recline() in ReclinerChair");
    }
}
