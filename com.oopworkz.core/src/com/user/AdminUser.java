package com.user;

public class AdminUser extends User {
    public AdminUser() {
        System.out.println("no-arg constructor of AdminUser");
    }

    @Override
    public void login() {
        System.out.println("Running overridden login() in AdminUser");
    }

    void resetPassword() {
        System.out.println("Running resetPassword() in AdminUser");
    }
}
