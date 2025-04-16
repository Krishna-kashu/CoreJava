package com.pot;

public class Pot extends Utensil {
    public Pot() {
        System.out.println("no-arg constructor of Pot");
    }

    @Override
    public void use() {
        System.out.println("Running overridden use in Pot");
    }

    void boilWater() {
        System.out.println("Running boilWater in Pot");
    }

}