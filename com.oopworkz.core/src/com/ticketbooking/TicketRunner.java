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

        Ticket tb1 = new Ticket();
        tb1.setDestination("Chennai");
        tb1.setTravelDate("2025-05-10");

        Ticket tb2 = new Ticket(tb1);
        System.out.println(tb2);

    }
}
