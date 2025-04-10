package com.notification;

public class NotificationRunner{
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.send();

        Notification notification1 = new EmailNotification();
        notification1.send();

        System.out.println("**********");

        EmailNotification emailNotification = new EmailNotification();
        emailNotification.send();
        emailNotification.addAttachment();
    }
}
