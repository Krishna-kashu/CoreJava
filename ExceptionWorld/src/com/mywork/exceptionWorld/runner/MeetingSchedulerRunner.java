package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.exception.MeetingConflictException;
import com.mywork.exceptionWorld.service.MeetingSchedulerService;

import java.time.LocalDateTime;

public class MeetingSchedulerRunner {
    public static void main(String[] args) {
        MeetingSchedulerService service = new MeetingSchedulerService();
        try {
            service.scheduleMeeting(LocalDateTime.of(2025, 6, 7, 14, 30), 30); // Overlaps
        } catch (MeetingConflictException e) {
            System.out.println("Scheduling failed: " + e.getMessage());
        }
    }
}
