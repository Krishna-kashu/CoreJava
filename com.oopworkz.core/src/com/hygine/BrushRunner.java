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
    }
}
