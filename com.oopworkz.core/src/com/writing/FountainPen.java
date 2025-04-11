package com.writing;

public class FountainPen  extends Pen {
    public FountainPen() {
        System.out.println("no-arg constructor of FountainPen");
    }

    @Override
    public void write() {
        System.out.println("Running overridden write() in FountainPen");
    }

    void refillInk() {
        System.out.println("Running refillInk() in FountainPen");
    }
}
