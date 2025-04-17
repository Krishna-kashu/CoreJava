package com.oopworkz.runner;
import com.oopworkz.constructor.Hourglass;

public class HourglassRunner {
    public static void main(String[] args) {

        Hourglass h1 = new Hourglass("White", 5, "Glass", "Medium");
        Hourglass h2 = new Hourglass("Black", 10, "Plastic", "Small");
        Hourglass h3 = new Hourglass("Black", 10, "Plastic", "Small");

        System.out.println("Hourglass 1: " + h1);
        System.out.println("Hourglass 2: " + h2);
        System.out.println("Hourglass 3: " + h3);

        boolean hMatch = h2.equals(h3);
        boolean hNotMatch = h1.equals(h2);
        System.out.println("Hourglass match: " + hMatch);
        System.out.println("Hourglass not match: " + hNotMatch);
    }
}
