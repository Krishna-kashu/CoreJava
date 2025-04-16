package com.recipe;

public class Recipe {
    private String dishName;
    private int cookTime;

    public Recipe() {
        System.out.println("no-arg constructor of Recipe");
    }

    public void prepare() {
        System.out.println("Running prepare in Recipe");
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public Recipe(Recipe ref) {
        this.dishName = ref.dishName;
        this.cookTime = ref.cookTime;
    }

    @Override
    public String toString() {
        return "Dish: " + dishName + ", Cook Time: " + cookTime + " mins";
    }

}

