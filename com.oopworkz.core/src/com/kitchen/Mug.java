package com.kitchen;

public class Mug {
    private String color;
    private int capacityMl;
    public Mug() {
        System.out.println("no-arg constructor of Mug");
    }

    public void fill() {
        System.out.println("Running fill() in Mug");
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacityMl(int capacityMl) {
        this.capacityMl = capacityMl;
    }

    public Mug(Mug ref) {
        this.color = ref.color;
        this.capacityMl = ref.capacityMl;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Capacity: " + capacityMl + " ml";
    }
}
