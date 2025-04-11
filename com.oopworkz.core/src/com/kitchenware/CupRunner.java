package com.kitchenware;

public class CupRunner {
public static void main(String[] args) {
    Cup c = new Cup();
    c.pour();

    Cup c1 = new TravelCup();
    c1.pour();

    System.out.println("**********");

    TravelCup tc = new TravelCup();
    tc.pour();
    tc.sealLid();
}
}
