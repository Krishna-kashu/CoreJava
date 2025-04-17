package com.oopworkz.runner;
import com.oopworkz.constructor.Typewriter;

public class TypewriterRunner {
    public static void main(String[] args) {

        Typewriter t1 = new Typewriter("Remington", true, 42, "Black");
        Typewriter t2 = new Typewriter("Royal", false, 45, "Grey");
        Typewriter t3 = new Typewriter("Royal", false, 45, "Grey");

        System.out.println("Typewriter 1: " + t1);
        System.out.println("Typewriter 2: " + t2);
        System.out.println("Typewriter 3: " + t3);

        boolean tMatch = t2.equals(t3);
        boolean tNotMatch = t1.equals(t2);
        System.out.println("Typewriter match: " + tMatch);
        System.out.println("Typewriter not match: " + tNotMatch);
    }
}
