package com.user;

public class UserRunner {
    public static void main(String[] args) {
        User user = new User();
        user.login();

        User user1 = new AdminUser();
        user1.login();

        System.out.println("**********");

        AdminUser admin = new AdminUser();
        admin.login();
        admin.resetPassword();
    }
}
