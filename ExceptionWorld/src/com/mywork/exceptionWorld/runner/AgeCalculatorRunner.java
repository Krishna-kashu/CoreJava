package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.AgeCalculatorService;

public class AgeCalculatorRunner {
    public static void main(String[] args) {
        new AgeCalculatorService().calculateAge("2003-15-01");
    }
}
