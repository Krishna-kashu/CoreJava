package com.ticketing;

public class TicketRunner {
    public static void main(String[] args) {
        TicketMachine machine = new TicketMachine();
        machine.issueTicket();

        TicketMachine machine1 = new TrainTicketMachine();
        machine1.issueTicket();

        System.out.println("**********");

        TrainTicketMachine train = new TrainTicketMachine();
        train.issueTicket();
        train.selectDestination();
    }
}
