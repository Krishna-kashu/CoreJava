package com.sound;

public class SpeakerRunner  {
    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        speaker.playSound();

        Speaker speaker1 = new BluetoothSpeaker();
        speaker1.playSound();

        System.out.println("**********");

        BluetoothSpeaker bluetoothSpeaker = new BluetoothSpeaker();
        bluetoothSpeaker.playSound();
        bluetoothSpeaker.connectBluetooth();
    }
}
