package com.ticketing;

public class TrainTicketMachine extends TicketMachine {
    public TrainTicketMachine() {
        System.out.println("no-arg constructor of TrainTicketMachine");
    }

    @Override
    public void issueTicket() {
        System.out.println("Running overridden issueTicket() in TrainTicketMachine");
    }

    void selectDestination() {
        System.out.println("Running selectDestination() in TrainTicketMachine");
    }
}
