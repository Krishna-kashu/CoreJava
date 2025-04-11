package com.printing;

public class PaintRunner {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();

        Printer printer1 = new LaserPrinter();
        printer1.print();

        System.out.println("**********");

        LaserPrinter laser = new LaserPrinter();
        laser.print();
        laser.checkTonerLevel();
    }
}
