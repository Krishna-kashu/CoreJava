package com.oopworkz.runner;
import com.oopworkz.constructor.Telescope;

public class TelescopeRunner {
    public static void main(String[] args) {

        Telescope t1 = new Telescope(150, "Refractor", true, "Celestron");
        Telescope t2 = new Telescope(200, "Reflector", false, "Meade");
        Telescope t3 = new Telescope(200, "Reflector", false, "Meade");

        System.out.println("Telescope 1: " + t1);
        System.out.println("Telescope 2: " + t2);
        System.out.println("Telescope 3: " + t3);

        boolean tMatch = t2.equals(t3);
        boolean tNotMatch = t1.equals(t2);
        System.out.println("Telescope match: " + tMatch);
        System.out.println("Telescope not match: " + tNotMatch);
    }
}
