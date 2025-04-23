package com.project.interfaces.runner;

import com.project.interfaces.internal.rule.*;
import com.project.interfaces.external.impl.*;

public class SevenMethodRunner {
    public static void main(String[] args) {

        System.out.println("\nDishwasher\n");
        Dishwasher d1 = new DishwasherImpl();
        DishwasherImpl d2 = new DishwasherImpl();
        d1.loadDishes();
        d1.addSoap();
        d1.selectMode();
        d1.startWash();
        d1.dryDishes();
        d1.stop();
        d1.cleanFilter();

        d2.loadDishes();
        d2.addSoap();
        d2.selectMode();
        d2.startWash();
        d2.dryDishes();
        d2.stop();
        d2.cleanFilter();

        System.out.println("\nDrone\n");
        Drone dr1 = new DroneImpl();
        DroneImpl dr2 = new DroneImpl();
        dr1.takeOff();
        dr1.fly();
        dr1.hover();
        dr1.capturePhoto();
        dr1.returnHome();
        dr1.land();
        dr1.recharge();

        dr2.takeOff();
        dr2.fly(); dr2.hover();
        dr2.capturePhoto();
        dr2.returnHome();
        dr2.land();
        dr2.recharge();

        System.out.println("\nProjector\n");
        Projector p1 = new ProjectorImpl();
        ProjectorImpl p2 = new ProjectorImpl();
        p1.powerOn();
        p1.selectSource();
        p1.adjustFocus();
        p1.adjustBrightness();
        p1.projectImage();
        p1.freezeFrame();
        p1.powerOff();

        p2.powerOn();
        p2.selectSource();
        p2.adjustFocus();
        p2.adjustBrightness();
        p2.projectImage();
        p2.freezeFrame();
        p2.powerOff();

        System.out.println("\nSmartDoorLock\n");
        SmartDoorLock s1 = new SmartDoorImpl();
        SmartDoorImpl s2 = new SmartDoorImpl();
        s1.lock();
        s1.unlock();
        s1.setPasscode();
        s1.enableAutoLock();
        s1.disableAutoLock();
        s1.checkBattery();
        s1.factoryReset();

        s2.lock();
        s2.unlock();
        s2.setPasscode();
        s2.enableAutoLock();
        s2.disableAutoLock();
        s2.checkBattery();
        s2.factoryReset();

        System.out.println("\nVideoConferencing\n");
        VideoConferencing v1 = new VideoConferencingImpl();
        VideoConferencingImpl v2 = new VideoConferencingImpl();
        v1.startMeeting();
        v1.joinMeeting();
        v1.mute();
        v1.unMute();
        v1.shareScreen();
        v1.recordMeeting();
        v1.endMeeting();

        v2.startMeeting();
        v2.joinMeeting();
        v2.mute();
        v2.unMute();
        v2.shareScreen();
        v2.recordMeeting();
        v2.endMeeting();
    }
}
