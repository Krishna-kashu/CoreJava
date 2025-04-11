package com.furniture;

public class Chair extends Furniture {
    public Chair() {
        System.out.println("no-arg constructor of Chair");
    }

    @Override
    public void assemble() {
        System.out.println("Running overridden assemble in Chair");
    }

    void adjustHeight() {
        System.out.println("Running adjustHeight in Chair");
    }
}
