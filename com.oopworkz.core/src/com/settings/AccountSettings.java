package com.settings;

public class AccountSettings {
    private String username;
    private boolean notificationsEnabled;
    public AccountSettings() {
        System.out.println("no-arg constructor of AccountSettings");
    }

    public void open() {
        System.out.println("Running open() in AccountSettings");
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNotificationsEnabled(boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    public AccountSettings(AccountSettings ref) {
        this.username = ref.username;
        this.notificationsEnabled = ref.notificationsEnabled;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Notifications: " + notificationsEnabled;
    }
}
