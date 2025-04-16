package com.hygine;

public class Brush {
    private String bristleType;
    private double length;
    public Brush() {
        System.out.println("no-arg constructor of Brush");
    }

    public void clean() {
        System.out.println("Running clean() in Brush");
    }


    public Brush(String bristleType, double length) {
        this.bristleType = bristleType;
        this.length = length;
        System.out.println("String, double constructor of Brush");
    }

    public Brush(Brush ref) {
        this.bristleType = ref.bristleType;
        this.length = ref.length;
    }

    @Override
    public String toString() {
        return "Bristle Type: " + bristleType + ", Length: " + length + "cm";
    }

}
