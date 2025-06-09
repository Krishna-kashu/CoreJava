package com.mywork.exceptionWorld.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TemperatureLoggerService {
    public void readLogs(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String temp;
            while ((temp = reader.readLine()) != null) {
                System.out.println("Temperature Log: " + temp);
            }
        } catch (IOException e) {
            System.out.println("Error reading temperature logs: " + e.getMessage());
        }
    }
}
