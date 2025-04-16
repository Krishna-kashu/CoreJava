package com.camera;

public class Camera {
    private double resolution;
    private boolean hasFlash;
        public Camera() {
            System.out.println("no-arg constructor of Camera");
        }

        public void takePhoto() {
            System.out.println("Running takePhoto() in Camera");
        }
    public Camera(double resolution, boolean hasFlash) {
        this.resolution = resolution;
        this.hasFlash = hasFlash;
        System.out.println("double, boolean constructor of Camera");
    }

    public Camera(Camera ref) {
        this.resolution = ref.resolution;
        this.hasFlash = ref.hasFlash;
    }

    @Override
    public String toString() {
        return "Camera Resolution: " + resolution + "MP, Flash: " + hasFlash;
    }
    }