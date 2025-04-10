package com.plant;

    public class Flower extends Plant {
        public Flower() {
            System.out.println("no-arg constructor of Flower");
        }

        @Override
        public void grow() {
            System.out.println("Running overridden grow() in Flower");
        }

        void bloom() {
            System.out.println("Running bloom() in Flower");
        }
    }
