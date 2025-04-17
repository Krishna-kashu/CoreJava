package com.oopworkz.constructor;
import java.util.Objects;
public class Thermostat  {
    private String temperatureRange;
    private String brand;
    private boolean isSmart;
    private String color;

    public Thermostat(String temperatureRange, String brand, boolean isSmart, String color) {
        this.temperatureRange = temperatureRange;
        this.brand = brand;
        this.isSmart = isSmart;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Thermostat{" +
                "temperatureRange='" + temperatureRange + '\'' +
                ", brand='" + brand + '\'' +
                ", isSmart=" + isSmart +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Thermostat) {
            Thermostat temperatureRange = (Thermostat) obj;
            if (Objects.equals(this.temperatureRange, temperatureRange.temperatureRange) &&
                    Objects.equals(this.brand, temperatureRange.brand)) {
                System.out.println("Thermostat is matching..");
                return true;
            }
        }
        return false;
    }
}
