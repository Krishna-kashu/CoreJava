package com.oopworkz.runner;
import com.oopworkz.setter.DeskLamp;

public class DeskLampRunner {
    public static void main(String[] args) {
        DeskLamp d1 = new DeskLamp();
        d1.setType("LED");
        d1.setBrightnessLevel(5);
        d1.setIsDimmable(true);
        d1.setColor("White");

        DeskLamp d2 = new DeskLamp();
        d2.setType("Halogen");
        d2.setBrightnessLevel(4);
        d2.setIsDimmable(false);
        d2.setColor("Yellow");

        DeskLamp d3 = new DeskLamp();
        d3.setType("Halogen");
        d3.setBrightnessLevel(4);
        d3.setIsDimmable(false);
        d3.setColor("Yellow");

        System.out.println("DeskLamp 1: " + d1);
        System.out.println("DeskLamp 2: " + d2);
        System.out.println("DeskLamp 3: " + d3);

        boolean match = d2.equals(d3);
        boolean notMatch = d1.equals(d2);
        System.out.println("DeskLamp match: " + match);
        System.out.println("DeskLamp not match: " + notMatch);
    }
}
