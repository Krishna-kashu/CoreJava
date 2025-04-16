package com.settings;

public class SettingsRunner {
    public static void main(String[] args) {
        AccountSettings acc = new AccountSettings();
        acc.open();

        AccountSettings acc1 = new PrivacySettings();
        acc1.open();

        System.out.println("**********");

        PrivacySettings privacy = new PrivacySettings();
        privacy.open();
        privacy.enableTwoFactor();

        AccountSettings acc2 = new AccountSettings();
        acc2.setUsername("user123");
        acc2.setNotificationsEnabled(true);

        AccountSettings acc3 = new AccountSettings(acc2);
        System.out.println(acc3);

    }
}
