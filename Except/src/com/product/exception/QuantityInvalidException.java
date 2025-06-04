package com.product.exception;

public class QuantityInvalidException extends RuntimeException{
    public QuantityInvalidException(String message) {
        super(message);
    }
}
