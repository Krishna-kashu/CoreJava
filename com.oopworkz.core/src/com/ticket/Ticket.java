package com.ticket;

public class Ticket {
    private String seatNo;
    private double price;
        public Ticket() {
            System.out.println("no-arg constructor of Ticket");
        }

        public void book() {
            System.out.println("Running book() in Ticket");
        }

      public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ticket(Ticket ref) {
        this.seatNo = ref.seatNo;
        this.price = ref.price;
    }

    @Override
    public String toString() {
        return "Seat No: " + seatNo + ", Price: ₹" + price;
    }

}