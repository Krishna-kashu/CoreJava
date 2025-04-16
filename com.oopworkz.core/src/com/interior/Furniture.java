package com.interior;

public class Furniture {
    private int furnitureId;
    private String furnitureName;
    public Furniture() {
        System.out.println("Furniture constructor called");
    }
    public Furniture(int id, String name) {
        this.furnitureId = id;
        this.furnitureName = name;
        System.out.println("int, String constructor of Furniture");
    }

    public Furniture(Furniture ref) {
        this.furnitureId = ref.furnitureId;
        this.furnitureName = ref.furnitureName;
    }

    @Override
    public String toString() {
        return "Furniture ID: " + furnitureId + ", Furniture Name: " + furnitureName;
    }
    public void place() {
        System.out.println("Placing the furniture");
    }
}
