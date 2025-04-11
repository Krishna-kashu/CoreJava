package com.workshop;

public class Drill extends Tool {
    public Drill() {
        System.out.println("Drill constructor called");
    }

    @Override
    public void use() {
        System.out.println("Drilling a hole");
    }

    public void changeBit() {
        System.out.println("Changing the drill bit");
    }
}
