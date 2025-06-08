package com.mywork.exceptionWorld.service;

import com.mywork.exceptionWorld.exception.InvalidColorCodeException;

public class DesignService {
    public void applyColor(String code) throws InvalidColorCodeException {
        if (!code.matches("#[0-9a-fA-F]{6}"))
            throw new InvalidColorCodeException(code);
        System.out.println("Applied color: " + code);
    }
}
