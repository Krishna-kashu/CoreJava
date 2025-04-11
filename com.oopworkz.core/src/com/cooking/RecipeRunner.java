package com.cooking;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        recipe.cook();

        Recipe recipe1 = new VeganRecipe();
        recipe1.cook();

        System.out.println("**********");

        VeganRecipe vegan = new VeganRecipe();
        vegan.cook();
        vegan.listIngredients();
    }
}
