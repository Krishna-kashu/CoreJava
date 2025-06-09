package com.mywork.exceptionWorld.service;

public class TemperatureService {
    public double convertToDouble(String temp) {
        try {
            return Double.parseDouble(temp);
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature format.");
            return 0.0;
        }
    }
}
