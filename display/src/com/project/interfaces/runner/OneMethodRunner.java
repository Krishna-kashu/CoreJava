package com.project.interfaces.runner;

import com.project.interfaces.external.impl.*;
import com.project.interfaces.internal.rule.*;

public class OneMethodRunner {

        public static void main(String[] args) {
            System.out.println("\nToothbrush\n");
            Toothbrush tb1 = new ToothbrushImpl();
            ToothbrushImpl tb2 = new ToothbrushImpl();
            tb1.brushTeeth();
            tb2.brushTeeth();

            System.out.println("\nCoffeeMachine\n");
            CoffeeMachine cm1 = new CoffeeMachineImpl();
            CoffeeMachineImpl cm2 = new CoffeeMachineImpl();
            cm1.onMachine();
            cm2.onMachine();

            System.out.println("\nLightSwitch\n");
            LightSwitch ls1 = new LightSwitchImpl();
            LightSwitchImpl ls2 = new LightSwitchImpl();
            ls1.toggle();
            ls2.toggle();

            System.out.println("\n WaterBottle\n ");
            WaterBottle wb1 = new WaterBottleImpl();
            WaterBottleImpl wb2 = new WaterBottleImpl();
            wb1.drink();
            wb2.drink();

            System.out.println("\n Doorbell\n ");
            DoorBell db1 = new DoorBellImpl();
            DoorBellImpl db2 = new DoorBellImpl();
            db1.ring();
            db2.ring();
        }
    }

