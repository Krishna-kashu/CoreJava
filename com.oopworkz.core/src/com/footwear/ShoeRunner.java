package com.footwear;

public class ShoeRunner{
    public static void main(String[] args) {
        Shoe shoe = new Shoe();
        shoe.wear();

        Shoe shoe1 = new RunningShoe();
        shoe1.wear();

        System.out.println("**********");

        RunningShoe running = new RunningShoe();
        running.wear();
        running.tieLaces();
    }
}
