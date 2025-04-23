package com.project.interfaces.runner;

import com.project.interfaces.external.impl.*;
import com.project.interfaces.internal.rule.*;

public class NineMethodRunner {

    public static void main(String[] args) {

        System.out.println("\n--- Water Heater  ---");
        WaterHeater waterHeater = new WaterHeaterImpl();
        WaterHeaterImpl waterHeater1=new WaterHeaterImpl();
        waterHeater.turnOn();
        waterHeater.setTemperature();
        waterHeater.increaseTemperature();
        waterHeater.decreaseTemperature();
        waterHeater.checkWaterLevel();
        waterHeater.startHeating();
        waterHeater.stopHeating();
        waterHeater.selfClean();
        waterHeater.turnOff();

        waterHeater1.turnOn();
        waterHeater1.setTemperature();
        waterHeater1.increaseTemperature();
        waterHeater1.decreaseTemperature();
        waterHeater1.checkWaterLevel();
        waterHeater1.startHeating();
        waterHeater1.stopHeating();
        waterHeater1.selfClean();
        waterHeater1.turnOff();


        System.out.println("\n--- Smart Fan ---");
        SmartFan smartFan = new SmartFanImpl();
        SmartFanImpl smartFan1= new SmartFanImpl();
        smartFan.turnOn();
        smartFan.setSpeed();
        smartFan.increaseSpeed();
        smartFan.decreaseSpeed();
        smartFan.rotateLeft();
        smartFan.rotateRight();
        smartFan.enableTimer();
        smartFan.disableTimer();
        smartFan.turnOff();

        smartFan1.turnOn();
        smartFan1.setSpeed();
        smartFan1.increaseSpeed();
        smartFan1.decreaseSpeed();
        smartFan1.rotateLeft();
        smartFan1.rotateRight();
        smartFan1.enableTimer();
        smartFan1.disableTimer();
        smartFan1.turnOff();

        System.out.println("\n--- Rice Cooker  ---");
        RiceCooker riceCooker = new RiceCookerImpl();
        RiceCookerImpl riceCooker1=new RiceCookerImpl();
        riceCooker.turnOn();
        riceCooker.setTimer();
        riceCooker.startCooking();
        riceCooker.keepWarm();
        riceCooker.checkSteamLevel();
        riceCooker.stopCooking();
        riceCooker.cleanPot();
        riceCooker.openLid();
        riceCooker.turnOff();

        riceCooker1.turnOn();
        riceCooker1.setTimer();
        riceCooker1.startCooking();
        riceCooker1.keepWarm();
        riceCooker1.checkSteamLevel();
        riceCooker1.stopCooking();
        riceCooker1.cleanPot();
        riceCooker1.openLid();
        riceCooker1.turnOff();

        System.out.println("\n--- Window Blinds ---");
        WindowBlinds blinds = new WindowBlindsImpl();
        WindowBlindsImpl blinds1=new WindowBlindsImpl();
        blinds.open();
        blinds.tiltUp();
        blinds.tiltDown();
        blinds.lockPosition();
        blinds.unlockPosition();
        blinds.setTimer();
        blinds.calibrate();
        blinds.reset();
        blinds.close();

        blinds1.open();
        blinds1.tiltUp();
        blinds1.tiltDown();
        blinds1.lockPosition();
        blinds1.unlockPosition();
        blinds1.setTimer();
        blinds1.calibrate();
        blinds1.reset();
        blinds1.close();


        System.out.println("\n---Garden Maintenance Rules ---");
        GardenMaintenanceRule gardenMaintenance = new GardenMaintenanceImpl();
        GardenMaintenanceImpl gardenMaintenance1=new GardenMaintenanceImpl();
        gardenMaintenance.addFertilizer();
        gardenMaintenance.harvestProduce();
        gardenMaintenance.maintainLawn();
        gardenMaintenance.inspectSoil();
        gardenMaintenance.pruneTrees();
        gardenMaintenance.plantSeeds();
        gardenMaintenance.removeWeeds();
        gardenMaintenance.waterPlants();
        gardenMaintenance.trimHedges();

        gardenMaintenance1.addFertilizer();
        gardenMaintenance1.harvestProduce();
        gardenMaintenance1.maintainLawn();
        gardenMaintenance1.inspectSoil();
        gardenMaintenance1.pruneTrees();
        gardenMaintenance1.plantSeeds();
        gardenMaintenance1.removeWeeds();
        gardenMaintenance1.waterPlants();
        gardenMaintenance1.trimHedges();
    }
}
