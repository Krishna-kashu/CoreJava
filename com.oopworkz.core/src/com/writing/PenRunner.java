package com.writing;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.write();

        Pen pen1 = new FountainPen();
        pen1.write();

        System.out.println("**********");

        FountainPen fountain = new FountainPen();
        fountain.write();
        fountain.refillInk();

        Pen pen2 = new Pen();
        pen2.setInkColor("Blue");
        pen2.setBrand("Parker");

        Pen pen3 = new Pen(pen2);
        System.out.println(pen3);

    }
}
