package com.mirror;

public class Mirror {
    private String shape;
    private double height;
    public Mirror() {
        System.out.println("no-arg constructor of Mirror");
    }

    public void reflect() {
        System.out.println("Running switchOn() in Mirror");
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Mirror(Mirror ref) {
        this.shape = ref.shape;
        this.height = ref.height;
    }

    @Override
    public String toString() {
        return "Shape: " + shape + ", Height: " + height + " cm";
    }

}