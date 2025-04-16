package com.printing;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();

        Printer printer1 = new LaserPrinter();
        printer1.print();

        System.out.println("**********");

        LaserPrinter laser = new LaserPrinter();
        laser.print();
        laser.checkTonerLevel();

        Printer pr1 = new Printer();
        pr1.setModel("HP 3700");
        pr1.setColorPrinter(true);
        Printer pr2 = new Printer(pr1);
        System.out.println(pr2);

    }
}
