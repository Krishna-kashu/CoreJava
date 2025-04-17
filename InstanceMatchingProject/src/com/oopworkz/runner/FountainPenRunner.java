package com.oopworkz.runner;
import com.oopworkz.constructor.FountainPen;

public class FountainPenRunner {
    public static void main(String[] args) {

        FountainPen fp1 = new FountainPen(0.5, "Blue", "Pilot", true);
        FountainPen fp2 = new FountainPen(0.7, "Black", "Parker", false);
        FountainPen fp3 = new FountainPen(0.7, "Black", "Parker", false);

        System.out.println("FountainPen 1: " + fp1);
        System.out.println("FountainPen 2: " + fp2);
        System.out.println("FountainPen 3: " + fp3);

        boolean fpMatch = fp2.equals(fp3);
        boolean fpNotMatch = fp1.equals(fp2);
        System.out.println("FountainPen match: " + fpMatch);
        System.out.println("FountainPen not match: " + fpNotMatch);
    }
}
