package com.notification;

public class EmailNotification extends Notification {
    public EmailNotification() {
        System.out.println("no-arg constructor of EmailNotification");
    }

    @Override
    public void send() {
        System.out.println("Running overridden send() in EmailNotification");
    }

    void addAttachment() {
        System.out.println("Running addAttachment() in EmailNotification");
    }
}