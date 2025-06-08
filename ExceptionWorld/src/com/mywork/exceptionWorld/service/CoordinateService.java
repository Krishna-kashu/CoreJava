package com.mywork.exceptionWorld.service;

public class CoordinateService {
    public void convertCoordinates(String x, String y) {
        try {
            try {
                double xVal = Double.parseDouble(x);
                double yVal = Double.parseDouble(y);
                System.out.println("Converted coordinates: (" + xVal + ", " + yVal + ")");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Conversion failed: " + e.getMessage());
        }
    }
}
