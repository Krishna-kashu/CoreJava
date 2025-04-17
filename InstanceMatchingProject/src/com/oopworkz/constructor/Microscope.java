package com.oopworkz.constructor;

import java.util.Objects;

public class Microscope {

    private int magnification;
    private String lensType;
    private String brand;
    private boolean isDigital;

    public Microscope(int magnification, String lensType, String brand, boolean isDigital) {
        this.magnification = magnification;
        this.lensType = lensType;
        this.brand = brand;
        this.isDigital = isDigital;
    }

    @Override
    public String toString() {
        return "Microscope{" + "magnification=" + magnification + ", lensType='" + lensType  + ", brand='" + brand + ", isDigital=" + isDigital + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Microscope) {
            Microscope other = (Microscope) obj;
            if (Objects.equals(this.magnification, other.magnification) &&
                    Objects.equals(this.lensType, other.lensType)) {
                System.out.println("Microscope is matching..");
                return true;
            }
        }
        return false;
    }
}
