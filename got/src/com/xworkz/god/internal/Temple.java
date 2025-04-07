package com.xworkz.god.internal;

public class Temple {
    public Temple(){
        System.out.println("constructor of Temple");
    }

    public void open() {
        System.out.println("Temple is open to public.");
    }
    private void Darshana(){
        System.out.println("Running Darshana in Temple");
    }
    void maintain() {
        System.out.println("maintenance is running in Temple.");
    }
}
