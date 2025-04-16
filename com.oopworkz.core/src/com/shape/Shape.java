package com.shape;

public class Shape {
    private String type;
    private int sides;
    public Shape() {
        System.out.println("no-arg constructor of Shape");
    }

    public void draw() {
        System.out.println("Running draw() in Shape");
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public Shape(Shape ref) {
        this.type = ref.type;
        this.sides = ref.sides;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Sides: " + sides;
    }

}
