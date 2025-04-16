package com.kitchenware;

public class Cup {
    private String material;
    private int capacityMl;
    public Cup() {
        System.out.println("no-arg constructor of Cup");
    }

    public void pour() {
        System.out.println("Running pour() in Cup");
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacityMl(int capacityMl) {
        this.capacityMl = capacityMl;
    }

    public Cup(Cup ref) {
        this.material = ref.material;
        this.capacityMl = ref.capacityMl;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Capacity: " + capacityMl + " ml";
    }
}
