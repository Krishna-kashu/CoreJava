package com.door;

public class SlidingDoor extends Door {
    public SlidingDoor() {
        System.out.println("no-arg constructor of SlidingDoor");
    }

    @Override
    public void open() {
        System.out.println("Running overridden open() in SlidingDoor");
    }

    public void lock() {
        System.out.println("Running lock() in SlidingDoor");
    }
}
