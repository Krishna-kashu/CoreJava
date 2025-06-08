package com.mywork.exceptionWorld.service;

import com.mywork.exceptionWorld.exception.NoWiFiConnectionException;

public class IoTService {
    public void connectToNetwork(boolean isConnected) throws NoWiFiConnectionException {
        if (!isConnected)
            throw new NoWiFiConnectionException();
        System.out.println("Connected to Wi-Fi successfully.");
    }
}
