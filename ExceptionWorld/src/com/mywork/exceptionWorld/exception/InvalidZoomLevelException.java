package com.mywork.exceptionWorld.exception;

public class InvalidZoomLevelException extends Exception{
    public InvalidZoomLevelException(int level) {
        super("Zoom level " + level + " is not allowed. Max allowed is 10.");
    }
}
