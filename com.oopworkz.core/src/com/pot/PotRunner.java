package com.pot;

public class PotRunner {
    public static void main(String[] args) {
        Utensil utensil = new Utensil();
        utensil.use();

        Utensil utensil1 = new Pot();
        utensil1.use();

        System.out.println("**********");

        Pot pot = new Pot();
        pot.use();
        pot.boilWater();
    }
}
