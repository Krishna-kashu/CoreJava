package com.toolbox;

public class Wrench extends ToolBox {
    public Wrench() {
        System.out.println("no-arg constructor of Wrench");
    }

    @Override
    public void activate() {
        System.out.println("Running overridden activate in Wrench");
    }

    void adjustJawWidth() {
        System.out.println("Running adjustJawWidth in Wrench");
    }
}
