package com.stationery;

public class StationaryRunner {

    public static void main(String[] args) {
        Notebook n = new Notebook();
        n.open();

        Notebook n1 = new SketchBook();
        n1.open();

        System.out.println("**********");

        SketchBook sb = new SketchBook();
        sb.open();
        sb.drawSketch();
        Notebook nb1 = new Notebook();
        nb1.setBrand("Classmate");
        nb1.setPages(160);

        Notebook nb2 = new Notebook(nb1);
        System.out.println(nb2);

    }
}
