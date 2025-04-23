package com.project.interfaces.runner;

import com.project.interfaces.internal.rule.*;
import com.project.interfaces.external.impl.*;

public class FiveMethodRunner {
    public static void main(String[] args) {

        System.out.println("\nThermostat\n");
        Thermostat t1 = new ThermostatImpl();
        ThermostatImpl t2 = new ThermostatImpl();
        t1.increaseTemperature();
        t1.decreaseTemperature();
        t1.setSchedule();
        t1.showCurrentTemp();
        t1.turnOff();

        t2.increaseTemperature();
        t2.decreaseTemperature();
        t2.setSchedule();
        t2.showCurrentTemp();
        t2.turnOff();

        System.out.println("\nLaundryMachine\n");
        LaundryMachine l1 = new LaundryMachineImpl();
        LaundryMachineImpl l2 = new LaundryMachineImpl();
        l1.loadClothes();
        l1.addDetergent();
        l1.selectCycle();
        l1.startWash();
        l1.drainWater();

        l2.loadClothes();
        l2.addDetergent();
        l2.selectCycle();
        l2.startWash();
        l2.drainWater();

        System.out.println("\nToaster\n");
        Toaster to1 = new ProjectorImpl.ToasterImpl();
        ProjectorImpl.ToasterImpl to2 = new ProjectorImpl.ToasterImpl();
        to1.insertBread();
        to1.setTimer();
        to1.toast();
        to1.popUp();
        to1.cleanTray();

        to2.insertBread();
        to2.setTimer();
        to2.toast();
        to2.popUp();
        to2.cleanTray();

        System.out.println("\nShowerController\n");
        ShowerController s1 = new ShowerControllerImpl();
        ShowerControllerImpl s2 = new ShowerControllerImpl();
        s1.startShower();
        s1.setTemperature();
        s1.setPressure();
        s1.stopShower();
        s1.cleanNozzle();

        s2.startShower();
        s2.setTemperature();
        s2.setPressure();
        s2.stopShower();
        s2.cleanNozzle();

        System.out.println("\nCoffeeGrinder\n");
        CoffeeGrinder c1 = new CoffeeGrinderImpl();
        CoffeeGrinderImpl c2 = new CoffeeGrinderImpl();
        c1.fillBeans();
        c1.selectGrindSize();
        c1.grind();
        c1.stopGrinding();
        c1.cleanGrinder();

        c2.fillBeans();
        c2.selectGrindSize();
        c2.grind();
        c2.stopGrinding();
        c2.cleanGrinder();
    }
}
