package com.ticketing;

public class TicketMachine {
    private String location;
    private boolean isOnline;


    public TicketMachine() {
        System.out.println("no-arg constructor of TicketMachine");
    }

    public void issueTicket() {
        System.out.println("Running issueTicket() in TicketMachine");
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public TicketMachine(TicketMachine ref) {
        this.location = ref.location;
        this.isOnline = ref.isOnline;
    }

    @Override
    public String toString() {
        return "Location: " + location + ", Online: " + isOnline;
    }

}
