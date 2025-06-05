package com.product.exception;

public class InvalidStockLevelException extends Exception {
    public InvalidStockLevelException(String message) {
        super(message);
    }
}