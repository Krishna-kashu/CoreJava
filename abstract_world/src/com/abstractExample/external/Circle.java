package com.abstractExample.external;

import com.abstractExample.internal.Shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Running Draw in Circle");
    }
}
