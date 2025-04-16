package com.artist;

public class Paint {
    private String colorType;
    private int dryTime;
    public Paint() {
        System.out.println("Constructor of Paint");
    }

    public void apply() {
        System.out.println("Applying paint with brush");
    }
    public Paint(String colorType, int dryTime) {
        this.colorType = colorType;
        this.dryTime = dryTime;
        System.out.println("String, int constructor of Paint");
    }

    public Paint(Paint ref) {
        this.colorType = ref.colorType;
        this.dryTime = ref.dryTime;
    }

    @Override
    public String toString() {
        return "Paint color: " + colorType + ", Dry Time: " + dryTime + " mins";
    }

}
