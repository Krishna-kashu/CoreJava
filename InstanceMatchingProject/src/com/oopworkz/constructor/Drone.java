package com.oopworkz.constructor;
import java.util.Objects;
public class Drone {
        private int range;
        private double weight;
        private String camera;
        private String brand;

        public Drone(int range, double weight, String camera, String brand) {
            this.range = range;
            this.weight = weight;
            this.camera = camera;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Drone{" + "range=" + range + ", weight=" + weight + ", camera='" + camera  + ", brand='" + brand  + '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Drone) {
                Drone other = (Drone) obj;
                if (Objects.equals(this.camera, other.camera) &&
                        Objects.equals(this.range, other.range)){
                    System.out.println("Drone is matching..");
                    return true;
                }
            }
            return false;
        }
    }

