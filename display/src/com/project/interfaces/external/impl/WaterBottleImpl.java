package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.WaterBottle;

public class WaterBottleImpl implements WaterBottle {
    @Override
    public void drink() {
        System.out.println("Running drink in WaterBottleImpl");
    }
}