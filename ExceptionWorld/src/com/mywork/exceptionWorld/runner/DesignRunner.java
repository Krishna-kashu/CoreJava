package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.exception.InvalidColorCodeException;
import com.mywork.exceptionWorld.service.DesignService;

public class DesignRunner {
    public static void main(String[] args) {
        try {
            new DesignService().applyColor("#266ABC");
            new DesignService().applyColor("#XYZ123");
        } catch (InvalidColorCodeException e) {
            System.out.println(e.getMessage());
        }
    }
}
