package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.DoorBell;

public class DoorBellImpl implements DoorBell {
    @Override
    public void ring() {
        System.out.println("Running ring in DoorBellImpl");
    }
}
