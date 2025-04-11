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
    }
}
