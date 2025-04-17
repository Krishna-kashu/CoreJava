package com.oopworkz.runner;
import com.oopworkz.constructor.CoffeeGrinder;
public class CoffeeGrinderRunner {
    public static void main(String[] args) {

        CoffeeGrinder cg1 = new CoffeeGrinder("Manual", 500.0, false, "Hario");
        CoffeeGrinder cg2 = new CoffeeGrinder("Electric", 600.0, true, "Breville");
        CoffeeGrinder cg3 = new CoffeeGrinder("Electric", 600.0, true, "Breville");

        System.out.println("CoffeeGrinder 1: " + cg1);
        System.out.println("CoffeeGrinder 2: " + cg2);
        System.out.println("CoffeeGrinder 3: " + cg3);

        boolean cgMatch = cg2.equals(cg3);
        boolean cgNotMatch = cg1.equals(cg2);
        System.out.println("CoffeeGrinder match: " + cgMatch);
        System.out.println("CoffeeGrinder not match: " + cgNotMatch);
    }
}