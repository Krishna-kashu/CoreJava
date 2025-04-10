package com.revolver;

public class Weapon extends Tool {
    public Weapon() {
        System.out.println("no-arg constructor of Weapon");
    }

    public void load() {
        System.out.println("Running load in Weapon");

        Tool tool1 = new Tool();
        Tool tool2 = new Weapon();

        Weapon weapon1 = new Weapon();
    }

}
