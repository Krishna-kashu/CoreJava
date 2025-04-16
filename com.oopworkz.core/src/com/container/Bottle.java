package com.container;

public class Bottle {
    private int capacity;
    private String material;
    public Bottle() {
        System.out.println("no-arg constructor of Bottle");
    }

    public void fill() {
        System.out.println("Running fill() in Bottle");
    }
    public Bottle(int capacity, String material) {
        this.capacity = capacity;
        this.material = material;
        System.out.println("int, String constructor of Bottle");
    }

    public Bottle(Bottle ref) {
        this.capacity = ref.capacity;
        this.material = ref.material;
    }

    @Override
    public String toString() {
        return "Bottle Capacity: " + capacity + "ml, Material: " + material;
    }
}
