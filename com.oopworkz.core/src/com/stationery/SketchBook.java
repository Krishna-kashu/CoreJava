package com.stationery;

public class SketchBook extends Notebook {
    public SketchBook() {
        System.out.println("no-arg constructor of SketchBook");
    }

    @Override
    public void open() {
        System.out.println("Running overridden open() in SketchBook");
    }

    void drawSketch() {
        System.out.println("Running drawSketch() in SketchBook");
    }
}
