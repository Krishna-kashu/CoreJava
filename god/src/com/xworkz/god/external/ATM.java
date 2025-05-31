package com.xworkz.god.external;

import com.xworkz.god.internal.Card;

public class ATM {
    public void readCard(){
        System.out.println("read card in atm");
        Card card = new Card();
        card.swipe();
    }
}
