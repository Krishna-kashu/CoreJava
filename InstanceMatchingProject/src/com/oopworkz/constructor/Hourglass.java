package com.oopworkz.constructor;
import java.util.Objects;

public class Hourglass {

    private String sandColor;
    private int timeDuration; // in minutes
    private String material;
    private String size;

    public Hourglass(String sandColor, int timeDuration, String material, String size) {
        this.sandColor = sandColor;
        this.timeDuration = timeDuration;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Hourglass{" +"sandColor=" + sandColor + ", timeDuration=" + timeDuration + ", material=" + material + ", size='" + size + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Hourglass) {
            Hourglass other = (Hourglass) obj;
            if (Objects.equals(this.timeDuration,other.timeDuration) &&
                    Objects.equals(this.sandColor, other.sandColor)) {
                System.out.println("Hourglass is matching..");
                return true;
            }
        }
        return false;
    }
}
