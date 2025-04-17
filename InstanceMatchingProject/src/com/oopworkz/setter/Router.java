package com.oopworkz.setter;
import java.util.Objects;

public class Router {
    private String wifiStandard;
    private double maxSpeed;
    private boolean hasGuestNetwork;
    private String brand;

    public Router() {
        System.out.println("no argument constructor of Router...");
    }

    public void setWifiStandard(String wifiStandard) {
        this.wifiStandard = wifiStandard;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setHasGuestNetwork(boolean hasGuestNetwork) {
        this.hasGuestNetwork = hasGuestNetwork;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Router{" +"wifiStandard=" + wifiStandard +", maxSpeed=" + maxSpeed +", hasGuestNetwork=" + hasGuestNetwork +", brand=" + brand +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Router) {
            Router other = (Router) obj;
            if (Objects.equals(this.wifiStandard, other.wifiStandard) &&
                    this.maxSpeed == other.maxSpeed) {
                System.out.println("Router is matching..");
                return true;
            }
        }
        return false;
    }
}
