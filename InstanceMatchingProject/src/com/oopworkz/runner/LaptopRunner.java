package com.oopworkz.runner;
import com.oopworkz.setter.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setBrand("Dell");
        l1.setRam(16);
        l1.setPrice(1200);
        l1.setTouchScreen(true);

        Laptop l2 = new Laptop();
        l2.setBrand("HP");
        l2.setRam(8);
        l2.setPrice(800);
        l2.setTouchScreen(false);

        Laptop l3 = new Laptop();
        l3.setBrand("HP");
        l3.setRam(8);
        l3.setPrice(800);
        l3.setTouchScreen(false);

        System.out.println("Laptop 1: " + l1);
        System.out.println("Laptop 2: " + l2);
        System.out.println("Laptop 3: " + l3);

        boolean lMatch = l2.equals(l3);
        boolean lNotMatch = l1.equals(l2);
        System.out.println("Laptop match: " + lMatch);
        System.out.println("Laptop not match: " + lNotMatch);
    }
}
