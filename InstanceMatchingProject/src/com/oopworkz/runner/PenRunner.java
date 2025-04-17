package com.oopworkz.runner;

import com.oopworkz.setter.Pen;

public class PenRunner {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setCost(10);
        p1.setBrand("Cello");
        p1.setLength(14.5);

        Pen p2 = new Pen();
        p2.setColor("Green");
        p2.setCost(8);
        p2.setBrand("Reynolds");
        p2.setLength(13.0);

        Pen p3 = new Pen();
        p3.setColor("Green");
        p3.setCost(8);
        p3.setBrand("Reynolds");
        p3.setLength(13.0);

        System.out.println("Pen 1: " + p1);
        System.out.println("Pen 2: " + p2);
        System.out.println("Pen 3: " + p3);

        boolean pMatch = p2.equals(p3);
        boolean pNotMatch = p1.equals(p2);
        System.out.println("Pen match: " + pMatch);
        System.out.println("Pen not match: " + pNotMatch);
    }
}
