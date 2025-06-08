package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.IngredientService;

public class IngredientRunner {
    public static void main(String[] args) {
        String[] ingredients = {"Salt", "Sugar", "Flour"};
        new IngredientService().getIngredient(ingredients, 0);
        new IngredientService().getIngredient(ingredients, 5);
    }
}
