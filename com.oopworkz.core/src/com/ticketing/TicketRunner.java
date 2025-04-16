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
        TicketMachine tm1 = new TicketMachine();
        tm1.setLocation("Central Station");
        tm1.setIsOnline(true);

        TicketMachine tm2 = new TicketMachine(tm1);
        System.out.println(tm2);

    }
}
