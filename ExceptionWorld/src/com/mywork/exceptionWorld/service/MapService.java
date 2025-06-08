package com.mywork.exceptionWorld.service;

import com.mywork.exceptionWorld.exception.InvalidZoomLevelException;

public class MapService {
    public void setZoomLevel(int level) throws InvalidZoomLevelException {
        if (level > 10)
            throw new InvalidZoomLevelException(level);
        System.out.println("Zoom level set to " + level);
    }
}
