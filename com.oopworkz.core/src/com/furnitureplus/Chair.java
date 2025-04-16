package com.furnitureplus;

public class Chair {
    private int legCount;
    private boolean hasArmRest;
    public Chair() {
        System.out.println("Constructor of Chair");
    }

    public void sit() {
        System.out.println("Sitting on a chair");
    }


    public Chair(int legCount, boolean hasArmRest) {
        this.legCount = legCount;
        this.hasArmRest = hasArmRest;
        System.out.println("int, boolean constructor of Chair");
    }

    public Chair(Chair ref) {
        this.legCount = ref.legCount;
        this.hasArmRest = ref.hasArmRest;
    }

    @Override
    public String toString() {
        return "Leg Count: " + legCount + ", Has Arm Rest: " + hasArmRest;
    }

}
