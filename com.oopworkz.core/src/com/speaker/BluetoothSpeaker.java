package com.speaker;

public class BluetoothSpeaker extends Speaker {
    public BluetoothSpeaker() {
        System.out.println("no-arg constructor of BluetoothSpeaker");
    }

    @Override
    public void playSound() {
        System.out.println("Running overridden playSound() in BluetoothSpeaker");
    }

    void pairDevice() {
        System.out.println("Running pairDevice() in BluetoothSpeaker");
    }
}
