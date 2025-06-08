package com.mywork.exceptionWorld.service;

public class ShoppingService {
    public void fetchItem(String[] list, int index) {
        try {
            System.out.println("Item: " + list[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Item not found.");
        }
    }
}
