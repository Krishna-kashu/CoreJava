package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.TemperatureService;

public class TemperatureRunner {
        public static void main(String[] args) {
            System.out.println(new TemperatureService().convertToDouble("35"));
            System.out.println(new TemperatureService().convertToDouble("35C"));
        }
}
