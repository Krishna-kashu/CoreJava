package com.ticketbooking;

public class TicketRunner {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        t.book();

        Ticket t1 = new OnlineTicket();
        t1.book();

        System.out.println("**********");

        OnlineTicket ot = new OnlineTicket();
        ot.book();
        ot.sendEmail();
    }
}
