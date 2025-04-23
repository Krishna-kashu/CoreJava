package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.ShowerController;

public class ShowerControllerImpl implements ShowerController {
    @Override
    public void startShower() {
        System.out.println("Running startShower in ShowerControllerImpl");
    }

    @Override
    public void setTemperature() {
        System.out.println("Running setTemperature in ShowerControllerImpl");
    }

    @Override
    public void setPressure() {
        System.out.println("Running setPressure in ShowerControllerImpl");
    }

    @Override
    public void stopShower() {
        System.out.println("Running stopShower in ShowerControllerImpl");
    }

    @Override
    public void cleanNozzle() {
        System.out.println("Running cleanNozzle in ShowerControllerImpl");
    }
}
