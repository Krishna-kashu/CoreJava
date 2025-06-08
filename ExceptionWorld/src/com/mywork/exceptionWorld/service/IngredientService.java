package com.mywork.exceptionWorld.service;

public class IngredientService {
    public void getIngredient(String[] ingredients, int index) {
        try {
            System.out.println("Ingredient: " + ingredients[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for ingredients list.");
        }
    }
}
