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

        Reminder rem1 = new Reminder();
        rem1.setTask("Meeting");
        rem1.setTime("10:00 AM");
        Reminder rem2 = new Reminder(rem1);
        System.out.println(rem2);

    }
}
