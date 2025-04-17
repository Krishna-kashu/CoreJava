package com.oopworkz.runner;
import com.oopworkz.setter.Luggage;

public class LuggageRunner {
    public static void main(String[] args) {
        Luggage l1 = new Luggage();
        l1.setBrand("American Tourister");
        l1.setCapacity(60);
        l1.setHasWheels(true);
        l1.setWeight(4.5);

        Luggage l2 = new Luggage();
        l2.setBrand("Safari");
        l2.setCapacity(55);
        l2.setHasWheels(true);
        l2.setWeight(4.2);

        Luggage l3 = new Luggage();
        l3.setBrand("Safari");
        l3.setCapacity(55);
        l3.setHasWheels(true);
        l3.setWeight(4.2);

        System.out.println("Luggage 1: " + l1);
        System.out.println("Luggage 2: " + l2);
        System.out.println("Luggage 3: " + l3);

        boolean match = l2.equals(l3);
        boolean notMatch = l1.equals(l2);
        System.out.println("Luggage match: " + match);
        System.out.println("Luggage not match: " + notMatch);
    }
}
