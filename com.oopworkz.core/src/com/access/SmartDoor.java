package com.access;

public class SmartDoor extends Door {
    public SmartDoor() {
        System.out.println("Constructor of SmartDoor");
    }

    @Override
    public void open() {
        System.out.println("Opening the door using face recognition");
    }

    public void lockRemotely() {
        System.out.println("Locking the door remotely");
    }
}
