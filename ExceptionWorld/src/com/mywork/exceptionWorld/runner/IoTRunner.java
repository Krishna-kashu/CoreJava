package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.exception.NoWiFiConnectionException;
import com.mywork.exceptionWorld.service.IoTService;

public class IoTRunner {
    public static void main(String[] args) {
        try {
            new IoTService().connectToNetwork(false);
        } catch (NoWiFiConnectionException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
