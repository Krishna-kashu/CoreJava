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

        Recipe recipe2 = new Recipe("Pasta", "Noodles, Tomato, Garlic");
        Recipe recipe3 = new Recipe(recipe2);
        System.out.println(recipe3);

    }
}
