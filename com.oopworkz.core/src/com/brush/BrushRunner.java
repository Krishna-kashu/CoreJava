package com.brush;

public class BrushRunner {
    public static void main(String[] args) {
        Brush b = new Brush();
        b.clean();

        Brush b1 = new ElectricBrush();
        b1.clean();

        System.out.println("**********");

        ElectricBrush eb = new ElectricBrush();
        eb.clean();
        eb.vibrate();
    }
}
