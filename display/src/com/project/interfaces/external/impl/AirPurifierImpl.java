package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.AirPurifier;

public class AirPurifierImpl implements AirPurifier {
    @Override
    public void startPurifying() {
        System.out.println("Running startPurifying in AirPurifierImpl");
    }

    @Override
    public void stopPurifying() {
        System.out.println("Running stopPurifying in AirPurifierImpl");
    }

    @Override
    public void showAirQuality() {
        System.out.println("Running showAirQuality in AirPurifierImpl");
    }
}
