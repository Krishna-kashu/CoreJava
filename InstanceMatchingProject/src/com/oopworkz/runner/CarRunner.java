package com.oopworkz.runner;
import com.oopworkz.setter.Car;

public class CarRunner {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setBrand("Tesla");
        c1.setModel("Model S");
        c1.setYear(2021);
        c1.setPrice(79999);

        Car c2 = new Car();
        c2.setBrand("BMW");
        c2.setModel("X5");
        c2.setYear(2020);
        c2.setPrice(68999);

        Car c3 = new Car();
        c3.setBrand("BMW");
        c3.setModel("X5");
        c3.setYear(2020);
        c3.setPrice(68999);

        System.out.println("Car 1: " + c1);
        System.out.println("Car 2: " + c2);
        System.out.println("Car 3: " + c3);

        boolean cMatch = c2.equals(c3);
        boolean cNotMatch = c1.equals(c2);
        System.out.println("Car match: " + cMatch);
        System.out.println("Car not match: " + cNotMatch);
    }
}
