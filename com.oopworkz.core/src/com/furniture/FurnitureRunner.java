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

        Furniture furniture2 = new Furniture("Wood", 23.5);
        Furniture furniture3 = new Furniture(furniture2);
        System.out.println(furniture3);

    }
}
