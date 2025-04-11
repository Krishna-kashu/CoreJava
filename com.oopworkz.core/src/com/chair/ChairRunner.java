package com.chair;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.sit();

        Chair chair1 = new ReclinerChair();
        chair1.sit();

        System.out.println("**********");

        ReclinerChair recliner = new ReclinerChair();
        recliner.sit();
        recliner.recline();
    }
}
