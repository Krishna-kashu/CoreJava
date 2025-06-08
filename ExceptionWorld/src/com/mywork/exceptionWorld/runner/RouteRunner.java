package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.exception.RouteNotFoundException;
import com.mywork.exceptionWorld.service.DeliveryService;

public class RouteRunner {
    public static void main(String[] args) {
        try {
            new DeliveryService().findRoute("NYC", "NYC");
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
