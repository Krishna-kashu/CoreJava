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
        Shoe shoe2 = new Shoe("Nike", 9);
        Shoe shoe3 = new Shoe(shoe2);
        System.out.println(shoe3);

    }
}
