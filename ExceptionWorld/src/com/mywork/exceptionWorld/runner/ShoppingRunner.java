package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.ShoppingService;

public class ShoppingRunner {
    public static void main(String[] args) {
        String[] items = {"Milk", "Bread", "Eggs"};
        new ShoppingService().fetchItem(items, 4);
    }
}
