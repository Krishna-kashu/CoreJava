package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.UserProfileService;

public class UserProfileRunner {
    public static void main(String[] args) {
        String json = "{\"profile\": {\"name\": \"John\"}}";
        new UserProfileService().parseUserProfile(json);
        String json1 = "{\"profile\": {\"name\": \"John\", \"age\": 30}}";
        new UserProfileService().parseUserProfile(json1);
    }
}
