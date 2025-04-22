package com.abstractWork.runner;
import com.abstractWork.internal.Road;
import com.abstractWork.external.Highway;
import com.abstractWork.external.Street;

public class RoadRunner {
    public static void main(String[] args) {
        System.out.println("********** Highway *********");
        Road road = new Highway();
        road.driveOn();
        road.construct();
        road.repair();
        road.maintain();
        road.inspect();

        System.out.println("\n********* Street *********");
      Road road1=new Street();
        road1.driveOn();
        road1.construct();
        road1.repair();
        road1.maintain();
        road1.inspect();
    }
}
