package com.stationery;

public class StationaryRunner {

public class BookRunner {
    public static void main(String[] args) {
        Notebook n = new Notebook();
        n.open();

        Notebook n1 = new SketchBook();
        n1.open();

        System.out.println("**********");

        SketchBook sb = new SketchBook();
        sb.open();
        sb.drawSketch();
    }
}}
