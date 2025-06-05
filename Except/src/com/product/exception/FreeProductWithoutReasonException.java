package com.product.exception;

public class FreeProductWithoutReasonException extends Exception {
    public FreeProductWithoutReasonException(String message) {
        super(message);
    }
}