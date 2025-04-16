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

        User user2 = new User();
        user2.setUsername("CodeMaster42");
        user2.setIsPremium(true);

        User user3 = new User(user2);
        System.out.println(user3);

    }
}
