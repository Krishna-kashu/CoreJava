package com.artist;

public class SprayPaint extends Paint {
    public SprayPaint() {
        System.out.println("Constructor of SprayPaint");
    }

    @Override
    public void apply() {
        System.out.println("Applying paint with spray");
    }

    public void shakeCan() {
        System.out.println("Shaking the spray can");
    }
}
