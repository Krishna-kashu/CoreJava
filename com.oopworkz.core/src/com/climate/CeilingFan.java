package com.climate;

public class CeilingFan extends Fan {
    public CeilingFan() {
        System.out.println("Constructor of CeilingFan");
    }

    @Override
    public void rotate() {
        System.out.println("Ceiling fan rotating at high speed");
    }

    public void changeSpeed() {
        System.out.println("Changing fan speed");
    }
}
