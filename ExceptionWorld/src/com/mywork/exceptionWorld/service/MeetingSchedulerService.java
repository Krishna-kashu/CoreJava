package com.mywork.exceptionWorld.service;

import com.mywork.exceptionWorld.exception.MeetingConflictException;

import java.time.LocalDateTime;

public class MeetingSchedulerService {
    private LocalDateTime existingStart = LocalDateTime.of(2025, 6, 7, 14, 0);
    private int existingDurationMinutes = 60;

    public void scheduleMeeting(LocalDateTime newStart, int newDurationMinutes) throws MeetingConflictException {
        LocalDateTime existingEnd = existingStart.plusMinutes(existingDurationMinutes);
        LocalDateTime newEnd = newStart.plusMinutes(newDurationMinutes);

        if (!newEnd.isBefore(existingStart) && !newStart.isAfter(existingEnd)) {
            throw new MeetingConflictException("New meeting overlaps with existing meeting.");
        }
        System.out.println("Meeting scheduled from " + newStart + " to " + newEnd);
    }
}
