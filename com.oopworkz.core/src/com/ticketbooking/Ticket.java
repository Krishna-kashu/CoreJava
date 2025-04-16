package com.ticketbooking;

public class Ticket {
    public Ticket() {
        System.out.println("no-arg constructor of Ticket");
    }

    public void book() {
        System.out.println("Running book() in Ticket");
    }

    private String destination;
    private String travelDate;

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public Ticket(Ticket ref) {
        this.destination = ref.destination;
        this.travelDate = ref.travelDate;
    }

    @Override
    public String toString() {
        return "Destination: " + destination + ", Date: " + travelDate;
    }

}
