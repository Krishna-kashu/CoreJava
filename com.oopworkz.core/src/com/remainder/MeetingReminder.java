package com.remainder;

public class MeetingReminder extends Reminder {
    public MeetingReminder() {
        System.out.println("no-arg constructor of MeetingReminder");
    }

    @Override
    public void alert() {
        System.out.println("Running overridden alert() in MeetingReminder");
    }

    void addParticipants() {
        System.out.println("Running addParticipants() in MeetingReminder");
    }
}
