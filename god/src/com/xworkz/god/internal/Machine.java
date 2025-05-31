package com.xworkz.god.internal;

public class Machine {
    public void scan(){
        System.out.println("running scan in machines");
        Card card = new Card();
        card.swipe();
        card.validateExpiry();
    }
}
