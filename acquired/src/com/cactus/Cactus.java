package com.cactus;

public class Cactus extends Plant {
    public Cactus() {
        System.out.println("no-arg constructor of Cactus");
    }

    public void storeWater() {
        System.out.println("Running storeWater in Cactus");

        Thing thing1 = new Thing();
        Thing thing2 = new Plant();
        Thing thing3 = new Cactus();

        Plant plant1 = new Plant();
        Plant plant2 = new Cactus();

        Cactus cactus1 = new Cactus();
    }

}
