package com.oopworkz.constructor;
import java.util.Objects;

public class Calculator {

    private String model;
    private String brand;
    private boolean isScientific;
    private String powerType;

    public Calculator(String model, String brand, boolean isScientific, String powerType) {
        this.model = model;
        this.brand = brand;
        this.isScientific = isScientific;
        this.powerType = powerType;
    }

    @Override
    public String toString() {
        return "Calculator{" +"model='" + model + ", brand=" + brand +", isScientific=" + isScientific +", powerType=" + powerType + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Calculator) {
            Calculator calculator = (Calculator) obj;
            if (Objects.equals(this.model, calculator.model) &&
                    Objects.equals(this.brand, calculator.brand)) {
                System.out.println("Calculator is matching..");
                return true;
            }
        }
        return false;
    }
}
