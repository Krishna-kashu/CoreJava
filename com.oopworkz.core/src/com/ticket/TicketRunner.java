package com.ticket;

public class TicketRunner  {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.book();

        Ticket ticket1 = new MovieTicket();
        ticket1.book();

        System.out.println("**********");

        MovieTicket movie = new MovieTicket();
        movie.book();
        movie.selectSeat();

        Ticket t1 = new Ticket();
        t1.setSeatNo("A12");
        t1.setPrice(120.0);

        Ticket t2 = new Ticket(t1);
        System.out.println(t2);

    }
}
