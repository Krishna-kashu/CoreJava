package com.ticketbooking;

public class OnlineTicket extends Ticket {
    public OnlineTicket() {
        System.out.println("no-arg constructor of OnlineTicket");
    }

    @Override
    public void book() {
        System.out.println("Running overridden book() in OnlineTicket");
    }

    void sendEmail() {
        System.out.println("Running sendEmail() in OnlineTicket");
    }
}
