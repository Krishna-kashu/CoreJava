package com.oopworkz.constructor;

import java.util.Objects;

public class Telescope {

    private int zoomLevel;
    private String type;
    private boolean hasTripod;
    private String brand;

    public Telescope(int zoomLevel, String type, boolean hasTripod, String brand) {
        this.zoomLevel = zoomLevel;
        this.type = type;
        this.hasTripod = hasTripod;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Telescope{" + "zoomLevel=" + zoomLevel + ", type='" + type + '\'' + ", hasTripod=" + hasTripod + ", brand='" + brand + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Telescope) {
            Telescope other = (Telescope) obj;
            if (Objects.equals(this.zoomLevel, other.zoomLevel) &&
                    Objects.equals(this.type, other.type)) {
                System.out.println("Telescope is matching..");
                return true;
            }
        }
        return false;
    }
}
