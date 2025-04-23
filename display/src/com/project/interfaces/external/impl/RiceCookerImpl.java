package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.RiceCooker;

public class RiceCookerImpl implements RiceCooker {
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in RiceCookerImpl");
    }
    @Override
    public void turnOff() {
        System.out.println("Running turnOff in RiceCookerImpl");
    }
    @Override
    public void setTimer() {
        System.out.println("Running setTimer in RiceCookerImpl");
    }
    @Override
    public void startCooking() {
        System.out.println("Running startCooking in RiceCookerImpl");
    }
    @Override
    public void stopCooking() {
        System.out.println("Running stopCooking in RiceCookerImpl");
    }
    @Override
    public void keepWarm() {
        System.out.println("Running keepWarm in RiceCookerImpl");
    }
    @Override
    public void cleanPot() {
        System.out.println("Running cleanPot in RiceCookerImpl");
    }
    @Override
    public void checkSteamLevel() {
        System.out.println("Running checkSteamLevel in RiceCookerImpl");
    }
    @Override
    public void openLid() {
        System.out.println("Running openLid in RiceCookerImpl");
    }
}