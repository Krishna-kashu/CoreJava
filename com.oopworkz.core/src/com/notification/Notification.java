package com.notification;

public class Notification  {
    private String message;
    private boolean isRead;
    public Notification() {
        System.out.println("no-arg constructor of Notification");
    }

    public void send() {
        System.out.println("Running send() in Notification");
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    public Notification(Notification ref) {
        this.message = ref.message;
        this.isRead = ref.isRead;
    }

    @Override
    public String toString() {
        return "Message: " + message + ", Read: " + isRead;
    }

}
