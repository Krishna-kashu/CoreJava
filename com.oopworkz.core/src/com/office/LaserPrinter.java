package com.office;

public class LaserPrinter extends Printer {
    public LaserPrinter() {
        System.out.println("Constructor of LaserPrinter");
    }

    @Override
    public void print() {
        System.out.println("Printing using laser technology");
    }

    public void tonerLevel() {
        System.out.println("Checking toner level");
    }
}
