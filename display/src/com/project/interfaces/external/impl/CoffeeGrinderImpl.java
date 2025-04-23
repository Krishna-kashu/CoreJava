package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.CoffeeGrinder;

public class CoffeeGrinderImpl implements CoffeeGrinder {
    @Override
    public void fillBeans() {
        System.out.println("Running fillBeans in CoffeeGrinderImpl");
    }

    @Override
    public void selectGrindSize() {
        System.out.println("Running selectGrindSize in CoffeeGrinderImpl");
    }

    @Override
    public void grind() {
        System.out.println("Running grind in CoffeeGrinderImpl");
    }

    @Override
    public void stopGrinding() {
        System.out.println("Running stopGrinding in CoffeeGrinderImpl");
    }

    @Override
    public void cleanGrinder() {
        System.out.println("Running cleanGrinder in CoffeeGrinderImpl");
    }
}
