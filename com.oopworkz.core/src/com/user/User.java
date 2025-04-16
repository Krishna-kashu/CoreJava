package com.user;

public class User {
    private String username;
    private boolean isPremium;
    public User() {
        System.out.println("no-arg constructor of User");
    }

    public void login() {
        System.out.println("Running login() in User");
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public User(User ref) {
        this.username = ref.username;
        this.isPremium = ref.isPremium;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Premium: " + isPremium;
    }

}
