package com.mywork.exceptionWorld.service;

public class EmailService {
    public void validateEmail(String email) {
        try {
            if (!email.contains("@"))
                throw new IllegalArgumentException("Invalid email format");
            try {
                String domain = email.split("@")[1];
                if (!domain.equals("gmail.com") && !domain.equals("yahoo.com")) {
                    throw new IllegalArgumentException("Unsupported domain: " + domain);
                }
                System.out.println("Valid email: " + email);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Malformed email, missing domain.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
