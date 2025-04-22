package com.abstractWork.internal;
public abstract class Road {

    public Road() {
        System.out.println("No-arg constructor of Road");
    }

    public void driveOn() {
        System.out.println("Running driveOn in Road");
    }

    public void construct() {
        System.out.println("Running construct in Road");
    }

    public void repair() {
        System.out.println("Running repair in Road");
    }

    public void maintain() {
        System.out.println("Running maintain in Road");
    }

    public void inspect() {
        System.out.println("Running inspect in Road");
    }
}
