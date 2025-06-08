package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.exception.InvalidZoomLevelException;
import com.mywork.exceptionWorld.service.MapService;

public class MapRunner {
    public static void main(String[] args) {
        try {
            new MapService().setZoomLevel(15);
        } catch (InvalidZoomLevelException e) {
            System.out.println(e.getMessage());
        }
    }
}
