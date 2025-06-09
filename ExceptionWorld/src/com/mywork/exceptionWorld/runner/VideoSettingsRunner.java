package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.VideoPlayerService;

public class VideoSettingsRunner {
    public static void main(String[] args) {
        new VideoPlayerService().applySettings("laptop", "720p");
        new VideoPlayerService().applySettings("laptop", "1400p");
    }
}
