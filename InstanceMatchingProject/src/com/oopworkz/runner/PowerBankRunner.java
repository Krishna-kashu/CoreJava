package com.oopworkz.runner;
import com.oopworkz.constructor.PowerBank;

public class PowerBankRunner {
    public static void main(String[] args) {

        PowerBank pb1 = new PowerBank(10000, 2, "Anker", true);
        PowerBank pb2 = new PowerBank(15000, 3, "Xiaomi", false);
        PowerBank pb3 = new PowerBank(15000, 3, "Xiaomi", false);

        System.out.println("PowerBank 1: " + pb1);
        System.out.println("PowerBank 2: " + pb2);
        System.out.println("PowerBank 3: " + pb3);

        boolean pbMatch = pb2.equals(pb3);
        boolean pbNotMatch = pb1.equals(pb2);
        System.out.println("PowerBank match: " + pbMatch);
        System.out.println("PowerBank not match: " + pbNotMatch);
    }
}
