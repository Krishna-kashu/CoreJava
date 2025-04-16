package com.hydration;

public class Bottle {
    private int capacity;
    private String material;
    public Bottle() {
        System.out.println("Constructor of Bottle");
    }

    public void pour() {
        System.out.println("Pouring water from bottle");
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
        return "Capacity: " + capacity + "ml, Material: " + material;
    }

}
