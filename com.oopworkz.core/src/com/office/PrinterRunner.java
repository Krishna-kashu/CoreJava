package com.office;

public class PrinterRunner  {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();

        Printer p1 = new LaserPrinter();
        p1.print();

        System.out.println("**********");

        LaserPrinter lp = new LaserPrinter();
        lp.print();
        lp.tonerLevel();

        Printer p2 = new Printer();
        p2.setModel("HP LaserJet");
        p2.setPagesPerMinute(20);

        Printer p3 = new Printer(p2);
        System.out.println(p3);

    }
}
