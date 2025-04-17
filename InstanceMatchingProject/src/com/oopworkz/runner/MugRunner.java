package com.oopworkz.runner;

import com.oopworkz.setter.Mug;

public class MugRunner {
    public static void main(String[] args) {
        Mug m1 = new Mug();
        m1.setCapacity(350.0);
        m1.setMaterial("Ceramic");
        m1.setColor("Blue");
        m1.setInsulated(false);

        Mug m2 = new Mug();
        m2.setCapacity(500.0);
        m2.setMaterial("Stainless Steel");
        m2.setColor("Silver");
        m2.setInsulated(true);

        Mug m3 = new Mug();
        m3.setCapacity(500.0);
        m3.setMaterial("Stainless Steel");
        m3.setColor("Silver");
        m3.setInsulated(true);

        System.out.println("Mug 1: " + m1);
        System.out.println("Mug 2: " + m2);
        System.out.println("Mug 3: " + m3);

        boolean mMatch = m2.equals(m3);
        boolean mNotMatch = m1.equals(m2);
        System.out.println("Mug match: " + mMatch);
        System.out.println("Mug not match: " + mNotMatch);
    }
}
