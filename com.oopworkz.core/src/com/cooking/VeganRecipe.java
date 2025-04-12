package com.cooking;

public class VeganRecipe extends Recipe {
    public VeganRecipe() {
        System.out.println("no-arg constructor of VeganRecipe");
    }

    @Override
    public void cook() {
        System.out.println("Running overridden cook() in VeganRecipe");
    }

    public void listIngredients() {
        System.out.println("Running listIngredients() in VeganRecipe");
    }
}
