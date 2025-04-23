package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.LightSwitch;

public class LightSwitchImpl implements LightSwitch {
    @Override
    public void toggle() {
        System.out.println("Running toggle in LightSwitchImpl");
    }
}
