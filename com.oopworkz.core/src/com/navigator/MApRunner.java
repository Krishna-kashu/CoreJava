package com.navigator;

public class MApRunner{
    public static void main(String[] args) {
        Map map = new Map();
        map.showRoute();

        Map map1 = new GPSMap();
        map1.showRoute();

        System.out.println("**********");

        GPSMap gpsMap = new GPSMap();
        gpsMap.showRoute();
        gpsMap.giveDirections();
    }
}

