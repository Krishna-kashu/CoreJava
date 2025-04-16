package com.bed;

public class Bed{
    private String size;
    private String material;
    public Bed() {
        System.out.println("no-arg constructor of Bed");
    }

    public void sleep() {
        System.out.println("Running sleep() in Bed");
    }
    public Bed(String size, String material) {
        this.size = size;
        this.material = material;
        System.out.println("String, String constructor of Bed");
    }

    public Bed(Bed ref) {
        this.size = ref.size;
        this.material = ref.material;
    }

    @Override
    public String toString() {
        return "Bed Size: " + size + ", Material: " + material;
    }

}
