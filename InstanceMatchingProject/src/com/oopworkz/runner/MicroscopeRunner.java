package com.oopworkz.runner;
import com.oopworkz.constructor.Microscope;

public class MicroscopeRunner {
    public static void main(String[] args) {

        Microscope m1 = new Microscope(500, "Optical", "Zeiss", true);
        Microscope m2 = new Microscope(1000, "Digital", "Olympus", false);
        Microscope m3 = new Microscope(1000, "Digital", "Olympus", false);

        System.out.println("Microscope 1: " + m1);
        System.out.println("Microscope 2: " + m2);
        System.out.println("Microscope 3: " + m3);

        boolean mMatch = m2.equals(m3);
        boolean mNotMatch = m1.equals(m2);
        System.out.println("Microscope match: " + mMatch);
        System.out.println("Microscope not match: " + mNotMatch);
    }
}
