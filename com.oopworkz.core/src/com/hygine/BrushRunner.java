package com.hygine;

public class BrushRunner {
    public static void main(String[] args) {
        Brush b = new Brush();
        b.clean();

        Brush b1 = new ToothBrush();
        b1.clean();

        System.out.println("**********");

        ToothBrush tb = new ToothBrush();
        tb.clean();
        tb.vibrate();

        Brush brush1 = new Brush("Nylon", 14.0);
        Brush brush2 = new Brush(brush1);
        System.out.println(brush2);

    }
}
