package com.kitchenware;

public class TravelCup extends Cup {
    public TravelCup() {
        System.out.println("no-arg constructor of TravelCup");
    }

    @Override
    public void pour() {
        System.out.println("Running overridden pour() in TravelCup");
    }

    void sealLid() {
        System.out.println("Running sealLid() in TravelCup");
    }
}
