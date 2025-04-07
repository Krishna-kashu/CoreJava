package com.xworkz.god.external;

import com.xworkz.god.internal.Drone;

import java.awt.dnd.DragSourceDragEvent;

public class Pilot {
    public void controlDrone(){
        System.out.println("running controlDrone in Pilot");
        Drone drone= new Drone();
        drone.on();
    }
}
