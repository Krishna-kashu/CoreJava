package com.recipe;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        recipe.prepare();

        Recipe recipe1 = new DessertRecipe();
        recipe1.prepare();

        System.out.println("**********");

        DessertRecipe dessert = new DessertRecipe();
        dessert.prepare();
        dessert.addSweeteners();
    }
}
