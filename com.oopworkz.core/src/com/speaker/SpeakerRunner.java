package com.speaker;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker sp = new Speaker();
        sp.playSound();

        Speaker sp1 = new BluetoothSpeaker();
        sp1.playSound();

        System.out.println("**********");

        BluetoothSpeaker bt = new BluetoothSpeaker();
        bt.playSound();
        bt.pairDevice();

        Speaker spk1 = new Speaker();
        spk1.setType("Bluetooth");
        spk1.setPowerWatt(15.5);

        Speaker spk2 = new Speaker(spk1);
        System.out.println(spk2);

    }
}
