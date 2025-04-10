package com.tool;

public class Hammer extends Tool {
    public Hammer() {
        System.out.println("no-arg constructor of Hammer..");
    }

    @Override
    public void use() {
        System.out.println("running overridden use in hammer.");
    }

    public void swing() {
        System.out.println("swing running in Hammer");
    }
}