package com.shape;

public class Circle extends Shape {
    public Circle() {
        System.out.println("no-arg constructor of Circle");
    }

    @Override
    public void draw() {
        System.out.println("Running overridden draw() in Circle");
    }

    void calculateArea() {
        System.out.println("Running calculateArea() in Circle");
    }
}