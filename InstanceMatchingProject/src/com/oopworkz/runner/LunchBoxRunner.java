package com.oopworkz.runner;
import com.oopworkz.setter.LunchBox;

public class LunchBoxRunner {
    public static void main(String[] args) {
        LunchBox l1 = new LunchBox();
        l1.setColor("Blue");
        l1.setCost(250);
        l1.setBrand("Milton");
        l1.setShape("Round");

        LunchBox l2 = new LunchBox();
        l2.setColor("Red");
        l2.setCost(200);
        l2.setBrand("Cello");
        l2.setShape("Square");

        LunchBox l3 = new LunchBox();
        l3.setColor("Red");
        l3.setCost(200);
        l3.setBrand("Cello");
        l3.setShape("Square");

        System.out.println("LunchBox 1: " + l1);
        System.out.println("LunchBox 2: " + l2);
        System.out.println("LunchBox 3: " + l3);

        boolean match = l2.equals(l3);
        boolean notMatch = l1.equals(l2);
        System.out.println("LunchBox match: " + match);
        System.out.println("LunchBox not match: " + notMatch);
    }
}
