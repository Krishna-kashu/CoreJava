package com.transport;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.move();

        Vehicle v1 = new Car();
        v1.move();

        System.out.println("**********");

        Car c = new Car();
        c.move();
        c.honk();
    }
}
