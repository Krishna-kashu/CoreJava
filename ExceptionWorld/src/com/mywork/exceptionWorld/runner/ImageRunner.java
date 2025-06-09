package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.ImageService;

public class ImageRunner {
    public static void main(String[] args) {
        new ImageService().resizeImage(100, 200);
        new ImageService().resizeImage(-100, 200);
    }
}
