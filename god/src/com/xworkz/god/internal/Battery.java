package com.xworkz.god.internal;

public class Battery {
    public void charge(){
        System.out.println("running charge in battery");
        Drone drone= new Drone();
        drone.on();
        drone.captureVideo();
    }
}
