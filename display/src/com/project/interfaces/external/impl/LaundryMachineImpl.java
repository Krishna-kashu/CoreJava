package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.LaundryMachine;

public class LaundryMachineImpl implements LaundryMachine {
    @Override
    public void loadClothes() {
        System.out.println("Running loadClothes in LaundryMachineImpl");
    }

    @Override
    public void addDetergent() {
        System.out.println("Running addDetergent in LaundryMachineImpl");
    }

    @Override
    public void selectCycle() {
        System.out.println("Running selectCycle in LaundryMachineImpl");
    }

    @Override
    public void startWash() {
        System.out.println("Running startWash in LaundryMachineImpl");
    }

    @Override
    public void drainWater() {
        System.out.println("Running drainWater in LaundryMachineImpl");
    }
}
