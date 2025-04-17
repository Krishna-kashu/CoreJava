package com.oopworkz.constructor;
import java.util.Objects;

public class MusicBox {

    private String tune;
    private String material;
    private String brand;
    private boolean isWindUp;

    public MusicBox(String tune, String material, String brand, boolean isWindUp) {
        this.tune = tune;
        this.material = material;
        this.brand = brand;
        this.isWindUp = isWindUp;
    }

    @Override
    public String toString() {
        return "MusicBox{" +"tune='" + tune +", material='" + material + ", brand='" + brand +", isWindUp=" + isWindUp +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MusicBox) {
            MusicBox musicBox = (MusicBox) obj;
            if (Objects.equals(this.tune, musicBox.tune) &&
                    Objects.equals(this.material, musicBox.material)) {
                System.out.println("MusicBox is matching..");
                return true;
            }
        }
        return false;
    }
}
