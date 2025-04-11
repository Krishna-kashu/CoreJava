package com.service;

public class CleaningService extends Service{
    public CleaningService() {
        System.out.println("no-arg constructor of CleaningService");
    }

    @Override
    public void provide() {
        System.out.println("Running overridden provide() in CleaningService");
    }

    void sanitizeArea() {
        System.out.println("Running sanitizeArea() in CleaningService");
    }
}
