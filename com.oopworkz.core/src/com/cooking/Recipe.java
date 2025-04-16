package com.cooking;

public class Recipe {
    private String recipeName;
    private String ingredientList;
    public Recipe() {
        System.out.println("no-arg constructor of Recipe");
    }

    public void cook() {
        System.out.println("Running cook() in Recipe");
    }
    public Recipe(String recipeName, String ingredientList) {
        this.recipeName = recipeName;
        this.ingredientList = ingredientList;
        System.out.println("String, String constructor of Recipe");
    }

    public Recipe(Recipe ref) {
        this.recipeName = ref.recipeName;
        this.ingredientList = ref.ingredientList;
    }

    @Override
    public String toString() {
        return "Recipe Name: " + recipeName + ", Ingredients: " + ingredientList;
    }
}
