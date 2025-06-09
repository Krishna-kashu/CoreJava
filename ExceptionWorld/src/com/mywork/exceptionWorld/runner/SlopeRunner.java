package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.SlopeService;

public class SlopeRunner {
    public static void main(String[] args) {
        System.out.println(new SlopeService().calculateSlope(4, 2, 4, 8));
    }
}
