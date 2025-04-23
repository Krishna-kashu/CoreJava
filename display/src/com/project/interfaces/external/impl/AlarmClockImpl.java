package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.AlarmClock;

public class AlarmClockImpl implements AlarmClock {

    @Override
    public void setAlarm() {
        System.out.println("Running setAlarm in AlarmClockImpl");
    }

    @Override
    public void snooze() {
        System.out.println("Running snooze in AlarmClockImpl");
    }

    @Override
    public void stopAlarm() {
        System.out.println("Running stopAlarm in AlarmClockImpl");
    }
}
