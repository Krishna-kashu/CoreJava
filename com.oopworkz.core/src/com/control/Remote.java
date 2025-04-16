package com.control;

public class Remote {
    private String remoteType;
    private int batteryLife;
    public Remote() {
        System.out.println("no-arg constructor of Remote");
    }

    public void pressButton() {
        System.out.println("Running pressButton() in Remote");
    }
    public Remote(String remoteType, int batteryLife) {
        this.remoteType = remoteType;
        this.batteryLife = batteryLife;
        System.out.println("String, int constructor of Remote");
    }

    public Remote(Remote ref) {
        this.remoteType = ref.remoteType;
        this.batteryLife = ref.batteryLife;
    }

    @Override
    public String toString() {
        return "Remote Type: " + remoteType + ", Battery Life: " + batteryLife + " hrs";
    }
}
