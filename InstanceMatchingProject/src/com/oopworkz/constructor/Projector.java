package com.oopworkz.constructor;
import java.util.Objects;
public class Projector {
        private String resolution;
        private int lumens;
        private String brand;
        private boolean isPortable;

        public Projector(String resolution, int lumens, String brand, boolean isPortable) {
            this.resolution = resolution;
            this.lumens = lumens;
            this.brand = brand;
            this.isPortable = isPortable;
        }

        @Override
        public String toString() {
            return "Projector{" +"resolution='" + resolution + ", lumens=" + lumens +", brand='" + brand + ", isPortable=" + isPortable +'}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Projector) {
                Projector other = (Projector) obj;
                if (Objects.equals(this.resolution, other.resolution) &&
                        Objects.equals(this.lumens, other.lumens)) {
                    System.out.println("Projector is matching..");
                    return true;
                }
            }
            return false;
        }
    }
