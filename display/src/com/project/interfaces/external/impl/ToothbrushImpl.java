package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.Toothbrush;

public class ToothbrushImpl implements Toothbrush {
    @Override
    public void brushTeeth() {
        System.out.println("Running Toothbrush in ToothbrushImpl");
    }
}
