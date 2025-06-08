package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.EventSchedulerService;

import java.time.LocalTime;

public class EventSchedulerRunner {
    public static void main(String[] args) {
        LocalTime event1End = LocalTime.of(10,30);
        LocalTime event2Start = LocalTime.of(10, 15);
        new EventSchedulerService().scheduleEvent(event1End,event2Start);
    }
}
