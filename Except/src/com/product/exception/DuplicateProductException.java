package com.product.exception;

public class DuplicateProductException extends Exception {
    public DuplicateProductException(String message) {
        super(message);
    }
}