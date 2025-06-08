package com.mywork.exceptionWorld.exception;

public class InvalidColorCodeException extends Exception{
    public InvalidColorCodeException(String code) {
        super("Invalid color code: " + code);
    }
}
