package com.bottle;

public class Bottle {
    private int capacity;
    private String color;
    public Bottle() {
        System.out.println("no-arg constructor of Bottle");
    }

    public void open() {
        System.out.println("Running open() in Bottle");
    }
    public Bottle(int capacity, String color) {
        this.capacity = capacity;
        this.color = color;
        System.out.println("int, String constructor of Bottle");
    }

    public Bottle(Bottle ref) {
        this.capacity = ref.capacity;
        this.color = ref.color;
    }

    @Override
    public String toString() {
        return "Bottle Capacity: " + capacity + "ml, Color: " + color;
    }
}
