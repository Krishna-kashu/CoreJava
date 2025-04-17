package com.oopworkz.constructor;
import java.util.Objects;

public class ThreeDPrinter {

    private double printVolume;
    private String materialType;
    private boolean isWiFiEnabled;
    private String brand;

    public ThreeDPrinter(double printVolume, String materialType, boolean isWiFiEnabled, String brand) {
        this.printVolume = printVolume;
        this.materialType = materialType;
        this.isWiFiEnabled = isWiFiEnabled;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "ThreeDPrinter{" +
                "printVolume=" + printVolume +", materialType='" + materialType +", isWiFiEnabled=" + isWiFiEnabled +", brand='" + brand +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ThreeDPrinter) {
            ThreeDPrinter threeDPrinter = (ThreeDPrinter) obj;
            if (Objects.equals(this.printVolume, this.printVolume)&&
                    Objects.equals(this.materialType, threeDPrinter.materialType)) {
                System.out.println("ThreeDPrinter is matching..");
                return true;
            }
        }
        return false;
    }
}
