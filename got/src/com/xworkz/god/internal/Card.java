package com.xworkz.god.internal;

public class Card {
    public void swipe(){
        System.out.println("swiping the card");
        validateExpiry();
    }
    private void encryptData(){
        System.out.println("running encryptData in Card");
    }
    void validateExpiry() {
        System.out.println("running validate expiry in Card");
    }
}