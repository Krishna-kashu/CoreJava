package Jet.internal;

public class Jet {
    private String model = "F-22 Raptor";
    private String manufacturer = "Lockheed Martin";
    private double maxSpeed = 2410.0;
    private boolean isStealth = true;
    private int capacity = 1;

    public Jet() {
        System.out.println("no-arg constructor for Jet");
    }

    void setModel(String model) {
        this.model = model;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void setStealth(boolean isStealth) {
        this.isStealth = isStealth;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isStealth() {
        return isStealth;
    }

    public int getCapacity() {
        return capacity;
    }
}
