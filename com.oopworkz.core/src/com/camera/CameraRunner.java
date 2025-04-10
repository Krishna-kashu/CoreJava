package com.camera;

public class CameraRunner {
        public static void main(String[] args) {
            Camera camera = new Camera();
            camera.takePhoto();

            Camera camera1 = new DSLR();
            camera1.takePhoto();

            System.out.println("**********");

            DSLR dslr = new DSLR();
            dslr.takePhoto();
            dslr.changeLens();
        }
}
