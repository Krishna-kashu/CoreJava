package com.brush;

public class Brush  {
    private String bristleType;
    private String brand;
    public Brush() {
        System.out.println("Constructor of Brush");
    }

    public void clean() {
        System.out.println("Cleaning manually with brush");
    }
    public Brush(String bristleType, String brand) {
        this.bristleType = bristleType;
        this.brand = brand;
        System.out.println("String, String constructor of Brush");
    }

    public Brush(Brush ref) {
        this.bristleType = ref.bristleType;
        this.brand = ref.brand;
    }

    @Override
    public String toString() {
        return "Brush Bristle Type: " + bristleType + ", Brand: " + brand;
    }
}

