package com.oopworkz.runner;
import com.oopworkz.constructor.Toaster;

public class ToasterRunner {
    public static void main(String[] args) {

        Toaster t1 = new Toaster(2, true, "Red", "Philips");
        Toaster t2 = new Toaster(4, false, "Black", "Bajaj");
        Toaster t3 = new Toaster(4, false, "Black", "Bajaj");

        System.out.println("Toaster 1: " + t1);
        System.out.println("Toaster 2: " + t2);
        System.out.println("Toaster 3: " + t3);

        boolean tMatch = t2.equals(t3);
        boolean tNotMatch = t1.equals(t2);
        System.out.println("Toaster match: " + tMatch);
        System.out.println("Toaster not match: " + tNotMatch);
    }
}
