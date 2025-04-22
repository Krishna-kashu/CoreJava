package com.abstractWork.external;

import com.abstractWork.internal.Road;

public class Highway extends Road {

    public Highway() {
        System.out.println("No-arg constructor of Highway");
    }

    @Override
    public void driveOn() {
        System.out.println("Running driveOn in Highway");
    }

    @Override
    public void construct() {
        System.out.println("Running construct in Highway");
    }

    @Override
    public void repair() {
        System.out.println("Running repair in Highway");
    }

    @Override
    public void maintain() {
        System.out.println("Running maintain in Highway");
    }

    @Override
    public void inspect() {
        System.out.println("Running inspect in Highway");
    }
}
