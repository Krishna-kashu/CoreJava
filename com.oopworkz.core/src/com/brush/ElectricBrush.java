package com.brush;

public class ElectricBrush  extends Brush {
    public ElectricBrush() {
        System.out.println("Constructor of ElectricBrush");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning using electric motion");
    }

    public void vibrate() {
        System.out.println("Brush is vibrating");
    }
}