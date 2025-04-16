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

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleType("Car");
        vehicle.setRegistrationNo("TN10AB1234");

        Vehicle vehicle1 = new Vehicle(vehicle);
        System.out.println(vehicle1);

    }
}
