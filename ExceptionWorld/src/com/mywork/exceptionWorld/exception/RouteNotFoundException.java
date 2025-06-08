package com.mywork.exceptionWorld.exception;

public class RouteNotFoundException extends Exception{
    public RouteNotFoundException(String route){
        super("Route not found"+route);
    }
}
