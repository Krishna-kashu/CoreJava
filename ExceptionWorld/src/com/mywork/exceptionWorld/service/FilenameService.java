package com.mywork.exceptionWorld.service;

public class FilenameService {
    public String getExtension(String filename) {
        try {
            return filename.substring(filename.lastIndexOf('.') + 1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid filename.");
            return "unknown";
        }
    }
}
