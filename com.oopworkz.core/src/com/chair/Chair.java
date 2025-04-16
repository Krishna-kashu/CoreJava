package com.chair;

public class Chair {
    private String type;
    private int legs;
    public Chair() {
        System.out.println("no-arg constructor of Chair");
    }

    public void sit() {
        System.out.println("Running sit() in Chair");
    }


    public Chair(String type, int legs) {
        this.type = type;
        this.legs = legs;
        System.out.println("String, int constructor of Chair");
    }

    public Chair(Chair ref) {
        this.type = ref.type;
        this.legs = ref.legs;
    }

    @Override
    public String toString() {
        return "Chair Type: " + type + ", Legs: " + legs;
    }
}
