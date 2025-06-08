package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.PlaylistService;

public class PlaylistRunner {
    public static void main(String[] args) {
        new PlaylistService().readPlaylist("playlist.txt");
    }
}
