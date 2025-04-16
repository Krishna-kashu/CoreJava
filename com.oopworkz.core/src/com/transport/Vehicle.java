package com.transport;

public class Vehicle {
    private String vehicleType;
    private String registrationNo;
    public Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    public void move() {
        System.out.println("Vehicle is moving");
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public Vehicle(Vehicle ref) {
        this.vehicleType = ref.vehicleType;
        this.registrationNo = ref.registrationNo;
    }

    @Override
    public String toString() {
        return "Type: " + vehicleType + ", Reg No: " + registrationNo;
    }

}
