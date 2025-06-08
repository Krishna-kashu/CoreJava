package com.mywork.exceptionWorld.service;

import com.mywork.exceptionWorld.exception.RouteNotFoundException;

public class DeliveryService {
    public void findRoute(String source, String destination) throws RouteNotFoundException {
        if (source.equals(destination)) {
            throw new RouteNotFoundException(source + " to " + destination);
        } else {
            System.out.println("Route found from " + source + " to " + destination);
        }
    }
}
