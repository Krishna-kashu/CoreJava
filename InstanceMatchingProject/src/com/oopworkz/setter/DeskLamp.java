package com.oopworkz.setter;
import java.util.Objects;

public class DeskLamp {
    private String type;
    private int brightnessLevel;
    private boolean isDimmable;
    private String color;

    public DeskLamp() {
        System.out.println("No-arg constructor of DeskLamp...");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrightnessLevel(int brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
    }

    public void setIsDimmable(boolean isDimmable) {
        this.isDimmable = isDimmable;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "DeskLamp" + "type=" + type + ", brightnessLevel=" + brightnessLevel + ", isDimmable=" + isDimmable + ", color=" + color ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof DeskLamp) {
            DeskLamp other = (DeskLamp) obj;
            if (Objects.equals(this.type, other.type) &&
                    Objects.equals(this.brightnessLevel, other.brightnessLevel)) {
                System.out.println("DeskLamp is matching..");
                return true;
            }
        }
        return false;
    }
}
