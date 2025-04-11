package com.footwear;

public class RunningShoe extends Shoe {
    public RunningShoe() {
        System.out.println("no-arg constructor of RunningShoe");
    }

    @Override
    public void wear() {
        System.out.println("Running overridden wear() in RunningShoe");
    }

    void tieLaces() {
        System.out.println("Running tieLaces() in RunningShoe");
    }
}
