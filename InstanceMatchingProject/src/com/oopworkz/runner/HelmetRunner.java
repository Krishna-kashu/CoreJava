package com.oopworkz.runner;
import com.oopworkz.setter.Helmet;

public class HelmetRunner {
    public static void main(String[] args) {
        Helmet h1 = new Helmet();
        h1.setColor("Black");
        h1.setCost(1200);
        h1.setBrand("Vega");
        h1.setSize("M");

        Helmet h2 = new Helmet();
        h2.setColor("Red");
        h2.setCost(1100);
        h2.setBrand("Steelbird");
        h2.setSize("L");

        Helmet h3 = new Helmet();
        h3.setColor("Red");
        h3.setCost(1100);
        h3.setBrand("Steelbird");
        h3.setSize("L");

        System.out.println("Helmet 1: " + h1);
        System.out.println("Helmet 2: " + h2);
        System.out.println("Helmet 3: " + h3);

        boolean match = h2.equals(h3);
        boolean notMatch = h1.equals(h2);
        System.out.println("Helmet match: " + match);
        System.out.println("Helmet not match: " + notMatch);
    }
}
