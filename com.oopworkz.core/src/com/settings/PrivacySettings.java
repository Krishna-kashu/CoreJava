package com.settings;

public class PrivacySettings extends AccountSettings {
    public PrivacySettings() {
        System.out.println("no-arg constructor of PrivacySettings");
    }

    @Override
    public void open() {
        System.out.println("Running overridden open() in PrivacySettings");
    }

    void enableTwoFactor() {
        System.out.println("Running enableTwoFactor() in PrivacySettings");
    }
}
