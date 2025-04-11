package com.recipe;

public class DessertRecipe extends Recipe {
    public DessertRecipe() {
        System.out.println("no-arg constructor of DessertRecipe");
    }

    @Override
    public void prepare() {
        System.out.println("Running overridden prepare() in DessertRecipe");
    }

    void addSweeteners() {
        System.out.println("Running addSweeteners() in DessertRecipe");
    }
}
