package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.Gadget;

public class Laptop implements Gadget {
    @Override
    public void portable() {
        System.out.println("Running portable in Laptop");
    }
}

