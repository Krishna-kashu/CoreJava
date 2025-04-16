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

        Notification n1 = new Notification();
        n1.setMessage("Welcome!");
        n1.setIsRead(false);

        Notification n2 = new Notification(n1);
        System.out.println(n2);

    }
}
