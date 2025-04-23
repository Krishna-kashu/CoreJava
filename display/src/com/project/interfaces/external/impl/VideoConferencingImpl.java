package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.VideoConferencing;

public class VideoConferencingImpl implements VideoConferencing {
    @Override
    public void startMeeting() {
        System.out.println("Running startMeeting in VideoConferencingImpl");
    }

    @Override
    public void joinMeeting() {
        System.out.println("Running joinMeeting in VideoConferencingImpl");
    }

    @Override
    public void mute() {
        System.out.println("Running mute in VideoConferencingImpl");
    }

    @Override
    public void unMute() {
        System.out.println("Running unMute in VideoConferencingImpl");
    }

    @Override
    public void recordMeeting() {
        System.out.println("Running recordMeeting in VideoConferencingImpl");

    }

    @Override
    public void shareScreen() {
        System.out.println("Running shareScreen in VideoConferencingImpl");
    }

    @Override
    public void endMeeting() {
        System.out.println("Running endMeeting in VideoConferencingImpl");
    }
}