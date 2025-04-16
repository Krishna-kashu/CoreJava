package com.storage;

public class Shelf {
    private int numberOfCompartments;
    private String material;
    public Shelf() {
        System.out.println("no-arg constructor of Shelf");
    }

    public void placeItem() {
        System.out.println("Running placeItem() in Shelf");
    }

    public void setNumberOfCompartments(int numberOfCompartments) {
        this.numberOfCompartments = numberOfCompartments;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Shelf(Shelf ref) {
        this.numberOfCompartments = ref.numberOfCompartments;
        this.material = ref.material;
    }

    @Override
    public String toString() {
        return "Compartments: " + numberOfCompartments + ", Material: " + material;
    }

}
