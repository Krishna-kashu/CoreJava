package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.Oven;

public class OvenImpl implements Oven {
    @Override
    public void preheat() {
        System.out.println("Running preheat in OvenImpl");
    }

    @Override
    public void bake() {
        System.out.println("Running bake in OvenImpl");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in OvenImpl");
    }
}
