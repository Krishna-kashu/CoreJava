package com.abstractWork.external;

import com.abstractWork.internal.Polygon;

public class Square extends Polygon {
    @Override
    public void draw() {
        System.out.println("Running draw in Triangle");
    }

    @Override
    public void rotate() {
        System.out.println("Running rotate in Triangle");
    }

    @Override
    public void calculateArea() {
        System.out.println("Running calculateArea in Triangle");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Running calculatePerimeter in Triangle");
    }

    @Override
    public void displayType() {
        System.out.println("Running displayType in Triangle");
    }
}
