package com.door;

public class DoorRunner {
    public static void main(String[] args) {
        Door door = new Door();
        door.open();

        Door door1 = new SlidingDoor();
        door1.open();

        System.out.println("**********");

        SlidingDoor sliding = new SlidingDoor();
        sliding.open();
        sliding.lock();
    }
}
