package com.abstractWork.runner;

import com.abstractWork.external.Triangle;
import com.abstractWork.external.Square;
import com.abstractWork.internal.Polygon;

public class PolygonRunner {
    public static void main(String[] args) {
        Polygon p1 = new Triangle();
        Polygon p2 = new Square();

        System.out.println("---- Triangle Info ----");
        p1.draw();
        p1.rotate();
        p1.calculateArea();
        p1.calculatePerimeter();
        p1.displayType();

        System.out.println("---- Square Info ----");
        p2.draw();
        p2.rotate();
        p2.calculateArea();
        p2.calculatePerimeter();
        p2.displayType();
    }
}
