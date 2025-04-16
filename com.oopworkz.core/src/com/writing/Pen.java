package com.writing;

public class Pen {
    private String inkColor;
    private String brand;
    public Pen() {
        System.out.println("no-arg constructor of Pen");
    }

    public void write() {
        System.out.println("Running write() in Pen");
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Pen(Pen ref) {
        this.inkColor = ref.inkColor;
        this.brand = ref.brand;
    }

    @Override
    public String toString() {
        return "Ink: " + inkColor + ", Brand: " + brand;
    }

}
