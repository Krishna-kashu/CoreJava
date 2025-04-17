package com.oopworkz.runner;
import com.oopworkz.constructor.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {

        Calculator c1 = new Calculator("FX-991EX", "Casio", true, "Solar");
        Calculator c2 = new Calculator("TI-84 Plus", "Texas Instruments", true, "Battery");
        Calculator c3 = new Calculator("TI-84 Plus", "Texas Instruments", true, "Battery");

        System.out.println("Calculator 1: " + c1);
        System.out.println("Calculator 2: " + c2);
        System.out.println("Calculator 3: " + c3);

        boolean cMatch = c2.equals(c3);
        boolean cNotMatch = c1.equals(c2);
        System.out.println("Calculator match: " + cMatch);
        System.out.println("Calculator not match: " + cNotMatch);
    }
}
