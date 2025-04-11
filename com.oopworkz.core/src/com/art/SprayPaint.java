package com.art;

public class SprayPaint extends Paint {
    public SprayPaint() {
        System.out.println("no-arg constructor of SprayPaint");
    }

    @Override
    public void apply() {
        System.out.println("Running overridden apply() in SprayPaint");
    }

    void shakeCan() {
        System.out.println("Running shakeCan() in SprayPaint");
    }
}
