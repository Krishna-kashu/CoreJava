package com.ticket;

public class MovieTicket  extends Ticket {
        public MovieTicket() {
            System.out.println("no-arg constructor of MovieTicket");
        }

        @Override
        public void book() {
            System.out.println("Running overridden book() in MovieTicket");
        }

        void selectSeat() {
            System.out.println("Running selectSeat() in MovieTicket");
        }
    }