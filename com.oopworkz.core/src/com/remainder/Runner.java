package com.remainder;

public class Runner {
    public static void main(String[] args) {
        Reminder reminder = new Reminder();
        reminder.alert();

        Reminder reminder1 = new MeetingReminder();
        reminder1.alert();

        System.out.println("**********");

        MeetingReminder meeting = new MeetingReminder();
        meeting.alert();
        meeting.addParticipants();
    }
}
