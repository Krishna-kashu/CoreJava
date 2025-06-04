package com.product.exception;

public class CategoryInvalidException extends RuntimeException{
    public CategoryInvalidException(String message) {
        super(message);
    }
}
