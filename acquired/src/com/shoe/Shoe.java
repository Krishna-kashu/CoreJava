package com.shoe;

public class Shoe extends Accessory {
    public Shoe() {
        System.out.println("no-arg constructor of Shoe");
    }

    public void wear() {
        System.out.println("Running wear in Shoe");

        Accessory accessory1 = new Accessory();
        Accessory accessory2 = new Shoe();

        Shoe shoe1 = new Shoe();
    }
}
