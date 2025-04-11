package com.content;

public class VideoContent extends Content {
    public VideoContent() {
        System.out.println("no-arg constructor of VideoContent");
    }

    @Override
    public void display() {
        System.out.println("Running overridden display in VideoContent");
    }

    void playInFullScreen() {
        System.out.println("Running playInFullScreen in VideoContent");
    }
}
