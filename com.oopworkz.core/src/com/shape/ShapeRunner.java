package com.shape;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Shape shape1 = new Circle();
        shape1.draw();

        System.out.println("**********");

        Circle circle = new Circle();
        circle.draw();
        circle.calculateArea();
    }
}
