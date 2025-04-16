package com.locker;

public class Locker {
    private String material;
    private int lockerNumber;
    public Locker() {
        System.out.println("Constructor of Locker");
    }

    public void lock() {
        System.out.println("Locking the locker");
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLockerNumber(int lockerNumber) {
        this.lockerNumber = lockerNumber;
    }

    public Locker(Locker locker) {
        this.material = locker.material;
        this.lockerNumber = locker.lockerNumber;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Locker Number: " + lockerNumber;
    }
}
