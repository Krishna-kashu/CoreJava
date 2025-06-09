package com.mywork.exceptionWorld.service;

public class VideoPlayerService {
    public void applySettings(String device, String resolution) {
        try {
            if (device.equals("unsupported-device")) {
                throw new UnsupportedOperationException("Device not supported");
            }
            try {
                if (!resolution.equals("1080p") && !resolution.equals("720p")) {
                    throw new IllegalArgumentException("Resolution not supported: " + resolution);
                }
                System.out.println("Settings applied: " + resolution + " on " + device);
            } catch (IllegalArgumentException e) {
                System.out.println("Resolution error: " + e.getMessage());
            }
        } catch (UnsupportedOperationException e) {
            System.out.println("Device error: " + e.getMessage());
        }
    }
}
