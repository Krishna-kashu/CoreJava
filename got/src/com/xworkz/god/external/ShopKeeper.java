package com.xworkz.god.external;

import com.xworkz.god.internal.Coin;

public class ShopKeeper {
    public void checkCoin(){
        System.out.println("running chechCoin in shopkeeper class");
        Coin coin = new Coin();
        coin.toss();
    }
}
