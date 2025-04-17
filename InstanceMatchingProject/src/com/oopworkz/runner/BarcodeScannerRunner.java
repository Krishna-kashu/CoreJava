package com.oopworkz.runner;
import com.oopworkz.constructor.BarcodeScanner;

public class BarcodeScannerRunner {
    public static void main(String[] args) {

        BarcodeScanner bs1 = new BarcodeScanner("Handheld", true, "Honeywell", 200.0);
        BarcodeScanner bs2 = new BarcodeScanner("Fixed", false, "Zebra", 150.0);
        BarcodeScanner bs3 = new BarcodeScanner("Fixed", false, "Zebra", 150.0);

        System.out.println("BarcodeScanner 1: " + bs1);
        System.out.println("BarcodeScanner 2: " + bs2);
        System.out.println("BarcodeScanner 3: " + bs3);

        boolean bsMatch = bs2.equals(bs3);
        boolean bsNotMatch = bs1.equals(bs2);
        System.out.println("BarcodeScanner match: " + bsMatch);
        System.out.println("BarcodeScanner not match: " + bsNotMatch);
    }
}
