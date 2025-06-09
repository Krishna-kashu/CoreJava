package com.mywork.exceptionWorld.service;

public class SlopeService {
    public double calculateSlope(int x1, int y1, int x2, int y2) {
        try {
            return (double) (y2 - y1) / (x2 - x1);
        } catch (ArithmeticException e) {
            System.out.println("Slope is undefined (divide by zero).");
            return Double.NaN;
        }
    }
}
