package com.navigator;

public class GPSMap extends Map {
    public GPSMap() {
        System.out.println("Constructor of GPSMap");
    }

    @Override
    public void showRoute() {
        System.out.println("Showing GPS route in real-time");
    }

    public void giveDirections() {
        System.out.println("Giving turn-by-turn voice directions");
    }
}