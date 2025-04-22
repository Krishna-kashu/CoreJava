package com.abstractExample.runner;

import com.abstractExample.external.Circle;
import com.abstractExample.internal.Shape;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
