package com.oopworkz.runner;

import com.oopworkz.constructor.Drone;

public class DroneRunner {
    public static void main(String[] args) {

        Drone d1 = new Drone(100, 1.5, "4K Camera", "DJI");
        Drone d2 = new Drone(120, 1.3, "HD Camera", "GoPro");
        Drone d3 = new Drone(120, 1.3, "HD Camera", "GoPro");

        System.out.println("Drone 1: " + d1);
        System.out.println("Drone 2: " + d2);
        System.out.println("Drone 3: " + d3);

        boolean dMatch = d2.equals(d3);
        boolean dNotMatch = d1.equals(d2);
        System.out.println("Drone match: " + dMatch);
        System.out.println("Drone not match: " + dNotMatch);
    }
}
