package com.access;

public class DoorRunner {
    public static void main(String[] args) {
        Door door1 = new Door();
        door1.open();

        Door door = new SmartDoor();
        door.open();

        System.out.println("**********");

        SmartDoor smartDoor = new SmartDoor();
        smartDoor.open();
        smartDoor.lockRemotely();

        Door door2=new Door("janani",9);
        Door door3=new Door(door2);
        System.out.println(door3);
    }
}
