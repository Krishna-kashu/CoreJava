package com.security;

public class Camera {
    private String resolution;
    private boolean dslr;
    public Camera() {
        System.out.println("Constructor of Camera");
    }

    public void capture() {
        System.out.println("Capturing photo");
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setDslr(boolean dslr) {
        this.dslr = dslr;
    }

    public Camera(Camera ref) {
        this.resolution = ref.resolution;
        this.dslr = ref.dslr;
    }

    @Override
    public String toString() {
        return "Resolution: " + resolution + ", DSLR: " + dslr;
    }

}
