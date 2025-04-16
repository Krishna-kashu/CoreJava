package com.classroom;

public class Board  {
    private String material;
    private double height;
    public Board() {
        System.out.println("no-arg constructor of Board");
    }

    public void clean() {
        System.out.println("Running clean in Board");
    }
    public Board(String material, double height) {
        this.material = material;
        this.height = height;
        System.out.println("String, double constructor of Board");
    }

    public Board(Board ref) {
        this.material = ref.material;
        this.height = ref.height;
    }

    @Override
    public String toString() {
        return "Board Material: " + material + ", Height: " + height;
    }
}
