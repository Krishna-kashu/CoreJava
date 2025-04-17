package com.oopworkz.setter;
import java.util.Objects;

public class AlarmClock {
    private boolean isDigital;
    private String alarmTone;
    private int snoozeDuration; // minutes
    private String brand;

    public AlarmClock() {
        System.out.println("no argument constructor of AlarmClock...");
    }

    public void setDigital(boolean digital) {
        isDigital = digital;
    }

    public void setAlarmTone(String alarmTone) {
        this.alarmTone = alarmTone;
    }

    public void setSnoozeDuration(int snoozeDuration) {
        this.snoozeDuration = snoozeDuration;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "AlarmClock{" +"isDigital=" + isDigital +", alarmTone='" + alarmTone + ", snoozeDuration=" + snoozeDuration +", brand='" + brand +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AlarmClock) {
            AlarmClock other = (AlarmClock) obj;
            if (Objects.equals(this.snoozeDuration, other.snoozeDuration) &&
                    Objects.equals(this.alarmTone, other.alarmTone)) {
                System.out.println("AlarmClock is matching..");
                return true;
            }
        }
        return false;
    }
}
