package com.security;

public class CameraRunner {
    public static void main(String[] args) {
        Camera c = new Camera();
        c.capture();

        Camera c1 = new SecurityCamera();
        c1.capture();

        System.out.println("**********");

        SecurityCamera sc = new SecurityCamera();
        sc.capture();
        sc.detectMotion();

        Camera cam1 = new Camera();
        cam1.setResolution("4K");
        cam1.setDslr(true);
        Camera cam2 = new Camera(cam1);
        System.out.println(cam2);

    }
}
