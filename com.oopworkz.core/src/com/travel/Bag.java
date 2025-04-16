package com.travel;

public class Bag {
    private String brand;
    private int compartments;
    public Bag() {
        System.out.println("Constructor of Bag");
    }

    public void carry() {
        System.out.println("Carrying the bag");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCompartments(int compartments) {
        this.compartments = compartments;
    }

    public Bag(Bag ref) {
        this.brand = ref.brand;
        this.compartments = ref.compartments;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Compartments: " + compartments;
    }

}
