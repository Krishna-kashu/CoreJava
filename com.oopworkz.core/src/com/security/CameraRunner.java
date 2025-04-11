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
    }
}
