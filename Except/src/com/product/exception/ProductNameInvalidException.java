package com.product.exception;

public class ProductNameInvalidException extends RuntimeException {
    public ProductNameInvalidException(String message) {
        super(message);
    }
}