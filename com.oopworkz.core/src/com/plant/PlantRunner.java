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
        }
    }
