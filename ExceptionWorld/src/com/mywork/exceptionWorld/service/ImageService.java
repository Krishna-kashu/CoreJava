package com.mywork.exceptionWorld.service;

public class ImageService {
    public void resizeImage(int width, int height) {
        try {
            if (width < 0 || height < 0)
                throw new IllegalArgumentException("Dimensions must be positive.");
            System.out.println("Resizing image to " + width + "x" + height);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
