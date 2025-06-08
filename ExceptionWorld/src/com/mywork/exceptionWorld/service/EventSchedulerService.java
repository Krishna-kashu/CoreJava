package com.mywork.exceptionWorld.service;

import java.time.LocalTime;

public class EventSchedulerService {
    public void scheduleEvent(LocalTime event1End, LocalTime event2Start) {
        try {
            if (!event1End.isBefore(event2Start)) {
                throw new IllegalArgumentException("Conflict: Event 1 ends after Event 2 starts.");
            }
            System.out.println("Event scheduled successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Scheduling error: " + e.getMessage());
        }
    }
}
