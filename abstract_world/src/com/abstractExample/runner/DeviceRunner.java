package com.abstractExample.runner;

import com.abstractExample.external.PersonalComputer;
import com.abstractExample.internal.Computer;
import com.abstractExample.internal.Device;

public class DeviceRunner {
    public static void main(String[] args) {

        Device device = new PersonalComputer();
        device.plugIn();
        device.turnOff();
        device.unplug();
        device.turnOn();

        Computer computer=new Computer();
        computer.turnOff();
        computer.turnOn();
        computer.plugIn();
        computer.unplug();

        PersonalComputer personalComputer=new PersonalComputer();
        personalComputer.turnOff();
        personalComputer.turnOn();
        personalComputer.plugIn();
        personalComputer.unplug();
    }}
