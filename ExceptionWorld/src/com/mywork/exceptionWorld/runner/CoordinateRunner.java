package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.CoordinateService;

public class CoordinateRunner {
    public static void main(String[] args) {
        new CoordinateService().convertCoordinates("12.5", "xyz");
    }
}
