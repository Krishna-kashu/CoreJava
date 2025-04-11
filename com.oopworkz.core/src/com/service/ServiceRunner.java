package com.service;

public class ServiceRunner {
        public static void main(String[] args) {
            Service service = new Service();
            service.provide();

            Service service1 = new CleaningService();
            service1.provide();

            System.out.println("**********");

            CleaningService cleaning = new CleaningService();
            cleaning.provide();
            cleaning.sanitizeArea();
        }
    }