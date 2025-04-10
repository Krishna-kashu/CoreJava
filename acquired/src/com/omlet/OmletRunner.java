package com.omlet;

public class OmletRunner {
    public static void main(String[] args) {

        System.out.println("\n -------- Dish -------- ");
        Dish dish = new Dish();
        dish.serve();

        System.out.println("\n --------- SideDish ------- ");
        SideDish sideDish = new SideDish();
        sideDish.taste();
        sideDish.serve();

        System.out.println("\n--------- Omlet ------ ");
        Omlet omlet = new Omlet();
        omlet.proteinRich();
        omlet.taste();
        omlet.serve();
    }
}
