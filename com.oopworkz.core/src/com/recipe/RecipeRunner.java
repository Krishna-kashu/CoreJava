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

        Recipe r1 = new Recipe();
        r1.setDishName("Pasta");
        r1.setCookTime(30);
        Recipe r2 = new Recipe(r1);
        System.out.println(r2);

    }
}
