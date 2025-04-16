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

        Speaker sp1 = new Speaker();
        sp1.setBrand("Sony");
        sp1.setVolumeLevel(7);

        Speaker sp2 = new Speaker(sp1);
        System.out.println(sp2);

    }
}
