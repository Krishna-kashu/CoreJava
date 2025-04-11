package com.furniture;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        furniture.assemble();

        Furniture furniture1 = new Chair();
        furniture1.assemble();

        System.out.println("**********");

        Chair chair = new Chair();
        chair.assemble();
        chair.adjustHeight();
    }
}
