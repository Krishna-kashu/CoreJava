package com.abstractWork.external;

import com.abstractWork.internal.Road;

public class Street extends Road {

    public Street() {
        System.out.println("No-arg constructor of Street");
    }

    @Override
    public void driveOn() {
        System.out.println("Running driveOn in Street");
    }

    @Override
    public void construct() {
        System.out.println("Running construct in Street");
    }

    @Override
    public void repair() {
        System.out.println("Running repair in Street");
    }

    @Override
    public void maintain() {
        System.out.println("Running maintain in Street");
    }

    @Override
    public void inspect() {
        System.out.println("Running inspect in Street");
    }
}
