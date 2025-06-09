package com.mywork.exceptionWorld.service;

public class UserProfileService {
    public void parseUserProfile(String json) {
        try {
            if (json.contains("\"profile\"")) {
                try {
                    if (json.contains("\"age\"")) {
                        int ageIndex = json.indexOf("\"age\"");
                        int colonIndex = json.indexOf(":", ageIndex);
                        int commaOrBrace = json.indexOf(",", colonIndex);
                        if (commaOrBrace == -1) commaOrBrace = json.indexOf("}", colonIndex);
                        String ageStr = json.substring(colonIndex + 1, commaOrBrace).trim();
                        int age = Integer.parseInt(ageStr);
                        System.out.println("User age: " + age);
                    } else {
                        throw new Exception("Age field not found");
                    }
                } catch (Exception e) {
                    System.out.println("Inner parsing failed: " + e.getMessage());
                }
            } else {
                throw new Exception("Profile object not found");
            }
        } catch (Exception e) {
            System.out.println("Invalid JSON: " + e.getMessage());
        }
    }
}
