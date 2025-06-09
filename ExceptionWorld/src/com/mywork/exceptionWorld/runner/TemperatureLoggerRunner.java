package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.TemperatureLoggerService;

public class TemperatureLoggerRunner {
    public static void main(String[] args) {
        new TemperatureLoggerService().readLogs("temperature.txt");
    }
}
