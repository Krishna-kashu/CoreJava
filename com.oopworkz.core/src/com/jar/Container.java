package com.jar;

public class Container {
    private String material;
    private double capacityLiters;
    public Container() {
        System.out.println("Container constructor called");
    }

    public void fill() {
        System.out.println("Filling the container");
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacityLiters(double capacityLiters) {
        this.capacityLiters = capacityLiters;
    }

    public Container(Container ref) {
        this.material = ref.material;
        this.capacityLiters = ref.capacityLiters;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Capacity: " + capacityLiters + " L";
    }

}
