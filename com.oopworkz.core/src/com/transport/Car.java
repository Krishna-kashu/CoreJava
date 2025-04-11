package com.transport;

public class Car extends Vehicle {
    public Car() {
        System.out.println("Car constructor called");
    }

    @Override
    public void move() {
        System.out.println("Car is driving");
    }

    public void honk() {
        System.out.println("Car is honking");
    }
}
