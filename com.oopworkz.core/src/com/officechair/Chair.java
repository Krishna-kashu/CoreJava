package com.officechair;

public class Chair  {
    private String material;
    private int legs;
    public Chair() {
        System.out.println("Constructor of Chair");
    }

    public void sit() {
        System.out.println("Sitting on a regular chair");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public Chair(Chair ref) {
        this.material = ref.material;
        this.legs = ref.legs;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Legs: " + legs;
    }
}
