package com.hygine;

public class ToothBrush extends Brush {
    public ToothBrush() {
        System.out.println("no-arg constructor of ToothBrush");
    }

    @Override
    public void clean() {
        System.out.println("Running overridden clean() in ToothBrush");
    }

    void vibrate() {
        System.out.println("Running vibrate() in ToothBrush");
    }
}
