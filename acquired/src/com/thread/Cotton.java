package com.thread;

public class Cotton extends Material {
    public Cotton() {
        System.out.println("no-arg constructor of Cotton");
    }

    public void weave() {
        System.out.println("Running weave in Cotton");

        Material material1 = new Material();
        Material material2 = new Cotton();

        Cotton cotton1 = new Cotton();
    }

}
