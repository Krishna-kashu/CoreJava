package com.interior;

public class FurnitureRunner{
    public static void main(String[] args) {
        Furniture f = new Furniture();
        f.place();

        Furniture f1 = new Table();
        f1.place();

        System.out.println("**********");

        Table t = new Table();
        t.place();
        t.fold();
    }
}
