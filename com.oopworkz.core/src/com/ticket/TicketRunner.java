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
    }
}
