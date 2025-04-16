package com.plant;

public class PlantRunner {

        public static void main(String[] args) {
            Plant plant = new Plant();
            plant.grow();

            Plant plant1 = new Flower();
            plant1.grow();

            System.out.println("**********");

            Flower flower = new Flower();
            flower.grow();
            flower.bloom();

            Plant p1 = new Plant();
            p1.setSpecies("Rose");
            p1.setHeight(30.5);
            Plant p2 = new Plant(p1);
            System.out.println(p2);

        }
    }
