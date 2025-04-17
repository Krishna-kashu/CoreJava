package com.oopworkz.constructor;
import java.util.Objects;

public class BarcodeScanner {

    private String scannerType;
    private boolean hasDisplay;
    private String brand;
    private double price;

    public BarcodeScanner(String scannerType, boolean hasDisplay, String brand, double price) {
        this.scannerType = scannerType;
        this.hasDisplay = hasDisplay;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BarcodeScanner{" +
                "scannerType='" + scannerType + '\'' +
                ", hasDisplay=" + hasDisplay +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof BarcodeScanner) {
            BarcodeScanner other = (BarcodeScanner) obj;
            if (Objects.equals(this.scannerType, other.scannerType) &&
                    Objects.equals(this.price, other.price)) {
                System.out.println("BarcodeScanner is matching..");
                return true;
            }
        }
        return false;
    }
}
