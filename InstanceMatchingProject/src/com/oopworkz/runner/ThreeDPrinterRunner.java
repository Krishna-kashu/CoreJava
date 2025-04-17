package com.oopworkz.runner;
import com.oopworkz.constructor.ThreeDPrinter;

public class ThreeDPrinterRunner {
    public static void main(String[] args) {

        ThreeDPrinter p1 = new ThreeDPrinter(150.0, "PLA", true, "MakerBot");
        ThreeDPrinter p2 = new ThreeDPrinter(300.0, "ABS", false, "Ultimaker");
        ThreeDPrinter p3 = new ThreeDPrinter(300.0, "ABS", false, "Ultimaker");

        System.out.println("3DPrinter 1: " + p1);
        System.out.println("3DPrinter 2: " + p2);
        System.out.println("3DPrinter 3: " + p3);

        boolean pMatch = p2.equals(p3);
        boolean pNotMatch = p1.equals(p2);
        System.out.println("3DPrinter match: " + pMatch);
        System.out.println("3DPrinter not match: " + pNotMatch);
    }
}
