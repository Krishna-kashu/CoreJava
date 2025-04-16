package com.bed;

public class AdjustableBed extends Bed {

    public AdjustableBed() {
        System.out.println("no-arg constructor of AdjustableBed");
    }

    @Override
    public void sleep() {
        System.out.println("Running overridden sleep() in AdjustableBed");
    }

    public void raiseHead() {
        System.out.println("Running raiseHead() in AdjustableBed");
    }

}
