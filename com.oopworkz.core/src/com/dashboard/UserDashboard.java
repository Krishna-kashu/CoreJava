package com.dashboard;

public class UserDashboard extends Dashboard {
    public UserDashboard() {
        System.out.println("no-arg constructor of UserDashboard");
    }

    @Override
    public void render() {
        System.out.println("Running overridden render in UserDashboard");
    }

    void showUserStats() {
        System.out.println("Running showUserStats in UserDashboard");
    }
}
