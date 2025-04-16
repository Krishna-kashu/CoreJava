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
        Door door2 = new Door("Wooden", 1.5);
        Door door3 = new Door(door2);
        System.out.println(door3);

    }
}
