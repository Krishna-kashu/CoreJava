package com.furnitureplus;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.sit();

        Chair chair1 = new MassageChair();
        chair1.sit();

        System.out.println("**********");

        MassageChair massageChair = new MassageChair();
        massageChair.sit();
        massageChair.massage();
    }
}
