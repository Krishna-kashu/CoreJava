package com.project.interfaces.runner;

import com.project.interfaces.external.impl.*;
import com.project.interfaces.internal.rule.*;

public class ThreeMethodRunner {
        public static void main(String[] args) {
            System.out.println("\nSmartMirror \n ");
            SmartMirror smartMirror=new SmartMirrorImpl();
            SmartMirrorImpl smartMirror1 = new SmartMirrorImpl();
            smartMirror.turnOn();
            smartMirror.showTime();
            smartMirror.showWeather();
            smartMirror1.turnOn();
            smartMirror1.showTime();
            smartMirror1.showWeather();

            System.out.println("\n Oven\n ");
            Oven ov1 = new OvenImpl();
            OvenImpl ov2 = new OvenImpl();
            ov1.preheat();
            ov1.bake();
            ov1.turnOff();
            ov2.preheat();
            ov2.bake();
            ov2.turnOff();

            System.out.println("\n AirPurifier\n ");
            AirPurifier ap1 = new AirPurifierImpl();
            AirPurifierImpl ap2 = new AirPurifierImpl();
            ap1.startPurifying();
            ap1.stopPurifying();
            ap1.showAirQuality();
            ap2.startPurifying();
            ap2.stopPurifying();
            ap2.showAirQuality();

            System.out.println("\n Blender\n ");
            Blender bl1 = new BlenderImpl();
            BlenderImpl bl2 = new BlenderImpl();
            bl1.blend();
            bl1.pulse();
            bl1.clean();
            bl2.blend();
            bl2.pulse();
            bl2.clean();

            System.out.println("\nAlarmClock \n ");
            AlarmClock ac1 = new AlarmClockImpl();
            AlarmClockImpl ac2 = new AlarmClockImpl();
            ac1.setAlarm();
            ac1.snooze();
            ac1.stopAlarm();
            ac2.setAlarm();
            ac2.snooze(); ac2.stopAlarm();
        }
}
