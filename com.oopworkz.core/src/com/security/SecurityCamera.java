package com.security;

public class SecurityCamera  extends Camera {
    public SecurityCamera() {
        System.out.println("Constructor of SecurityCamera");
    }

    @Override
    public void capture() {
        System.out.println("Recording surveillance footage");
    }

    public void detectMotion() {
        System.out.println("Motion detected");
    }
}
