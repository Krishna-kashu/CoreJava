package com.cactus;

public class Plant extends Thing {
    public Plant() {
        System.out.println("no-arg constructor of Plant");
    }

    public void grow() {
        System.out.println("Running grow in Plant");

        Thing thing1 = new Thing();
        Thing thing2 = new Plant();

        Plant plant1 = new Plant();
    }
}
