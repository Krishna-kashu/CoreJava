package com.oopworkz.constructor;
import java.util.Objects;

public class RobotVacuum {

    private double batteryLife;
    private String suctionPower;
    private boolean hasWiFi;
    private String brand;

    public RobotVacuum(double batteryLife, String suctionPower, boolean hasWiFi, String brand) {
        this.batteryLife = batteryLife;
        this.suctionPower = suctionPower;
        this.hasWiFi = hasWiFi;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "RobotVacuum{" +"batteryLife=" + batteryLife +", suctionPower=" + suctionPower + ", hasWiFi=" + hasWiFi +", brand=" + brand + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof RobotVacuum) {
            RobotVacuum other = (RobotVacuum) obj;
            if (Objects.equals(this.batteryLife, other.batteryLife) &&
                    Objects.equals(this.suctionPower, other.suctionPower)) {
                System.out.println("RobotVacuum is matching..");
                return true;
            }
        }
        return false;
    }
}
