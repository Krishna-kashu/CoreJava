package com.product.exception;

public class NegativeDiscountException extends Exception {
    public NegativeDiscountException(String message) {
        super(message);
    }
}