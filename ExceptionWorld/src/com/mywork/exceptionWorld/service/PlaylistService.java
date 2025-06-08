package com.mywork.exceptionWorld.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PlaylistService {
    public void readPlaylist(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String song;
            while ((song = reader.readLine()) != null) {
                System.out.println("Song: " + song);
            }
        } catch (IOException e) {
            System.out.println("Could not read playlist: " + e.getMessage());
        }
    }
}
