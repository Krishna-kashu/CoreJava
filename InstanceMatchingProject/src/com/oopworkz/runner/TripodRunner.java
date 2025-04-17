package com.oopworkz.runner;
import com.oopworkz.setter.Tripod;

public class TripodRunner {
    public static void main(String[] args) {
        Tripod t1 = new Tripod();
        t1.setMaterial("Aluminum");
        t1.setCost(1500);
        t1.setBrand("Digitek");
        t1.setHeight(4.5);

        Tripod t2 = new Tripod();
        t2.setMaterial("Plastic");
        t2.setCost(900);
        t2.setBrand("AmazonBasics");
        t2.setHeight(4.2);

        Tripod t3 = new Tripod();
        t3.setMaterial("Plastic");
        t3.setCost(900);
        t3.setBrand("AmazonBasics");
        t3.setHeight(4.2);

        System.out.println("Tripod 1: " + t1);
        System.out.println("Tripod 2: " + t2);
        System.out.println("Tripod 3: " + t3);

        boolean match = t2.equals(t3);
        boolean notMatch = t1.equals(t2);
        System.out.println("Tripod match: " + match);
        System.out.println("Tripod not match: " + notMatch);
    }
}
