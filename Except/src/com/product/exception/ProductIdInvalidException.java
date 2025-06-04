package com.product.exception;

public class ProductIdInvalidException extends RuntimeException{
    public ProductIdInvalidException(String message){
        super(message);
    }
}
