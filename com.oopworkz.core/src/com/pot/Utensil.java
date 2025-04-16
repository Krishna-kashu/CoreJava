package com.pot;

public class Utensil {
    private String material;
    private int diameter;
    public Utensil() {
        System.out.println("no-arg constructor of Utensil");
    }

    public void use() {
        System.out.println("Running use in Utensil");
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Utensil(Utensil utensil) {
        this.material = utensil.material;
        this.diameter = utensil.diameter;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Diameter: " + diameter + " cm";
    }

}