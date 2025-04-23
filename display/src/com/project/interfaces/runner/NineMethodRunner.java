package com.project.interfaces.runner;

import com.project.interfaces.external.impl.*;
import com.project.interfaces.internal.rule.GardenMaintenanceRule;

public class NineMethodRunner {

    public static void main(String[] args) {

        System.out.println("\n--- Water Heater  ---");
        WaterHeaterImpl waterHeater = new WaterHeaterImpl();
        waterHeater.turnOn();
        waterHeater.setTemperature();
        waterHeater.increaseTemperature();
        waterHeater.decreaseTemperature();
        waterHeater.checkWaterLevel();
        waterHeater.startHeating();
        waterHeater.stopHeating();
        waterHeater.selfClean();
        waterHeater.turnOff();


        System.out.println("\n--- Smart Fan ---");
        SmartFanImpl smartFan = new SmartFanImpl();
        smartFan.turnOn();
        smartFan.setSpeed();
        smartFan.increaseSpeed();
        smartFan.decreaseSpeed();
        smartFan.rotateLeft();
        smartFan.rotateRight();
        smartFan.enableTimer();
        smartFan.disableTimer();
        smartFan.turnOff();


        System.out.println("\n--- Rice Cooker  ---");
        RiceCookerImpl riceCooker = new RiceCookerImpl();
        riceCooker.turnOn();
        riceCooker.setTimer();
        riceCooker.startCooking();
        riceCooker.keepWarm();
        riceCooker.checkSteamLevel();
        riceCooker.stopCooking();
        riceCooker.cleanPot();
        riceCooker.openLid();
        riceCooker.turnOff();

        System.out.println("\n--- Window Blinds ---");
        WindowBlindsImpl blinds = new WindowBlindsImpl();
        blinds.open();
        blinds.tiltUp();
        blinds.tiltDown();
        blinds.lockPosition();
        blinds.unlockPosition();
        blinds.setTimer();
        blinds.calibrate();
        blinds.reset();
        blinds.close();


        System.out.println("\n---Garden Maintenance Rules ---");
        GardenMaintenanceRule gardenMaintenance = new GardenMaintenanceImpl();
        gardenMaintenance.addFertilizer();
        gardenMaintenance.harvestProduce();
        gardenMaintenance.maintainLawn();
        gardenMaintenance.inspectSoil();
        gardenMaintenance.pruneTrees();
        gardenMaintenance.plantSeeds();
        gardenMaintenance.removeWeeds();
        gardenMaintenance.waterPlants();
        gardenMaintenance.trimHedges();
    }
}
