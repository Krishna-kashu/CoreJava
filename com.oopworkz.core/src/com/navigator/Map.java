package com.navigator;

public class Map {
    private String region;
    private int scale;

    public Map() {
        System.out.println("Constructor of Map");
    }

    public void showRoute() {
        System.out.println("Showing route on paper map");
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public Map(Map ref) {
        this.region = ref.region;
        this.scale = ref.scale;
    }

    @Override
    public String toString() {
        return "Region: " + region + ", Scale: 1:" + scale;
    }

}