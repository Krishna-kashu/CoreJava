package com.oopworkz.runner;
import com.oopworkz.constructor.ElectricScooter;

public class ElectricScooterRunner {
    public static void main(String[] args) {

        ElectricScooter es1 = new ElectricScooter(4500, 25.0, "Xiaomi", true);
        ElectricScooter es2 = new ElectricScooter(3500, 20.0, "Segway", false);
        ElectricScooter es3 = new ElectricScooter(3500, 20.0, "Segway", false);

        System.out.println("ElectricScooter 1: " + es1);
        System.out.println("ElectricScooter 2: " + es2);
        System.out.println("ElectricScooter 3: " + es3);

        boolean esMatch = es2.equals(es3);
        boolean esNotMatch = es1.equals(es2);
        System.out.println("ElectricScooter match: " + esMatch);
        System.out.println("ElectricScooter not match: " + esNotMatch);
    }
}
