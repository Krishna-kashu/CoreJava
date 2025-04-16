package com.door;

public class Door {
    private String doorType;
    private double doorWidth;

    public Door() {
        System.out.println("no-arg constructor of Door");
    }

    public void open() {
        System.out.println("Running open() in Door");
    }


    public Door(String doorType, double doorWidth) {
        this.doorType = doorType;
        this.doorWidth = doorWidth;
        System.out.println("String, double constructor of Door");
    }

    public Door(Door ref) {
        this.doorType = ref.doorType;
        this.doorWidth = ref.doorWidth;
    }

    @Override
    public String toString() {
        return "Door Type: " + doorType + ", Width: " + doorWidth + " meters";
    }

}
