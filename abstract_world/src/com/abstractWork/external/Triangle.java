package com.abstractWork.external;

import com.abstractWork.internal.Polygon;

public class Triangle extends Polygon {
    @Override
    public void draw() {
        System.out.println("running Draw in Triangle");
    }

    @Override
    public void rotate() {
        System.out.println("Running Rotate in Triangle");
    }

    @Override
    public void calculateArea() {
        System.out.println("Running CalculateA rea in Triangle");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Running CalculatePerimeter in Triangle");
    }

    @Override
    public void displayType() {
        System.out.println("Running Display Type in Triangle");
    }
}
