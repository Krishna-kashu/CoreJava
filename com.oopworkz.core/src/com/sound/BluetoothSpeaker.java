package com.sound;

public class BluetoothSpeaker extends Speaker {
    public BluetoothSpeaker() {
        System.out.println("Constructor of BluetoothSpeaker");
    }

    @Override
    public void playSound() {
        System.out.println("Playing sound over Bluetooth");
    }

    public void connectBluetooth() {
        System.out.println("Connecting to Bluetooth");
    }
}
