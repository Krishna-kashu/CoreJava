package com.mywork.exceptionWorld.exception;

public class NoWiFiConnectionException extends Exception{
    public NoWiFiConnectionException(){
        super("No wifi connection available");
    }
}
