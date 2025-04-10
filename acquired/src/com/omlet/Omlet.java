package com.omlet;

public class Omlet extends SideDish {
    public Omlet() {
        System.out.println("no-arg constructor of Omlet");
    }

    public void proteinRich() {
        System.out.println("Running proteinRich in Omlet");

        Dish dish1 = new Dish();
        Dish dish2 = new SideDish();
        Dish dish3 = new Omlet();

        SideDish side1 = new SideDish();
        SideDish side2 = new Omlet();

        Omlet omlet1 = new Omlet();
    }
}