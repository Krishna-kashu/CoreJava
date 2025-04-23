package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.Dishwasher;

public class DishwasherImpl implements Dishwasher
{
    @Override
    public void loadDishes() {
        System.out.println("Running loadDishes in DishwasherImpl");
    }

    @Override
    public void addSoap() {
        System.out.println("Running addSoap in DishwasherImpl");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void selectMode() {
        System.out.println("Running selectMode in DishwasherImpl");
    }

    @Override
    public void startWash() {
        System.out.println("Running startWash in DishwasherImpl");
    }

    @Override
    public void dryDishes() {
        System.out.println("Running dryDishes in DishwasherImpl");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void stop() {
        System.out.println("Running stop in DishwasherImpl");
    }

    @Override
    public void cleanFilter() {
        System.out.println("Running cleanFilter in DishwasherImpl");
    }
}
