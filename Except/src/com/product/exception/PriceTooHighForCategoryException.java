package com.product.exception;


public class PriceTooHighForCategoryException extends Exception {
    public PriceTooHighForCategoryException(String message) {
        super(message);
    }
}