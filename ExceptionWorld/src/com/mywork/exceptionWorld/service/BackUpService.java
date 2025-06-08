package com.mywork.exceptionWorld.service;

import java.io.*;

public class BackUpService {
    public void loadConfig() {
        if (!tryRead("main-config.txt")) {
            System.out.println("Main config failed. Trying backup...");
            if (!tryRead("backup-config.txt")) {
                System.out.println("Backup config also failed.");
            }
        }
    }

    private boolean tryRead(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Loaded from: " + fileName);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
