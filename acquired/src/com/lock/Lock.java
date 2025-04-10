package com.lock;

public class Lock extends Security {
    public Lock() {
        System.out.println("no-arg constructor of Lock");
    }

    public void unlock() {
        System.out.println("Running unlock in Lock");

        // Object creation possibilities
        Security security1 = new Security();
        Security security2 = new Lock();

        Lock lock1 = new Lock();
    }
}
