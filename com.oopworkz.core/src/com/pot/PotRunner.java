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

        Utensil utensil2 = new Utensil();
        utensil2.setMaterial("Ceramic");
        utensil2.setDiameter(20);
        Utensil utensil3 = new Utensil(utensil2);
        System.out.println(utensil3);

    }
}
