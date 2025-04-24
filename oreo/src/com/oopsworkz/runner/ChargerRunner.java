package com.oopsworkz.runner;

import com.oopsworkz.impl.LaptopCharger;
import com.oopsworkz.impl.PhoneCharger;
import com.oopsworkz.internal.Charger;
import com.oopsworkz.other.Socket;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger= new LaptopCharger();
        charger.charge();

        Charger charger1= new PhoneCharger();
        charger1.charge();

        Socket socket= new Socket(charger);
        socket.SwitchOn();

        Socket socket1= new Socket(charger1);
        socket1.SwitchOn();
    }
}
