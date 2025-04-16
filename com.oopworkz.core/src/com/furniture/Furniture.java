package com.furniture;

public class Furniture {
    private String material;
    private double weight;
    public Furniture() {
        System.out.println("no-arg constructor of Furniture");
    }

    public void assemble() {
        System.out.println("Running assemble in Furniture");
    }


    public Furniture(String material, double weight) {
        this.material = material;
        this.weight = weight;
        System.out.println("String, double constructor of Furniture");
    }

    public Furniture(Furniture ref) {
        this.material = ref.material;
        this.weight = ref.weight;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Weight: " + weight;
    }

}
