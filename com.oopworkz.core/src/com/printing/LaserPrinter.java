package com.printing;

public class LaserPrinter extends Printer {
    public LaserPrinter() {
        System.out.println("no-arg constructor of LaserPrinter");
    }

    @Override
    public void print() {
        System.out.println("Running overridden print() in LaserPrinter");
    }

    void checkTonerLevel() {
        System.out.println("Running checkTonerLevel() in LaserPrinter");
    }
}
