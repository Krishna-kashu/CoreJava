package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.GardenMaintenanceRule;

public class GardenMaintenanceImpl implements GardenMaintenanceRule {
    @Override
    public void waterPlants() {
        System.out.println("Running waterPlants in GardenMaintenanceImpl");
    }

    @Override
    public void trimHedges() {
        System.out.println("Running trimHedges in GardenMaintenanceImpl");
    }

    @Override
    public void plantSeeds() {
        System.out.println("Running plantSeeds in GardenMaintenanceImpl");
    }

    @Override
    public void removeWeeds() {
        System.out.println("Running removeWeeds in GardenMaintenanceImpl");
    }

    @Override
    public void addFertilizer() {
        System.out.println("Running addFertilizer in GardenMaintenanceImpl");
    }

    @Override
    public void pruneTrees() {
        System.out.println("Running pruneTrees in GardenMaintenanceImpl");
    }

    @Override
    public void inspectSoil() {
        System.out.println("Running inspectSoil in GardenMaintenanceImpl");
    }

    @Override
    public void maintainLawn() {
        System.out.println("Running maintainLawn in GardenMaintenanceImpl");
    }

    @Override
    public void harvestProduce() {
        System.out.println("Running harvestProduce in GardenMaintenanceImpl");
    }
}