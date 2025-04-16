package com.stream;

public class Stream {
    private String platform;
    private boolean isLive;
    public Stream() {
        System.out.println("no-arg constructor of Stream");
    }

    public void start() {
        System.out.println("Running start in Stream");
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setIsLive(boolean isLive) {
        this.isLive = isLive;
    }

    public Stream(Stream ref) {
        this.platform = ref.platform;
        this.isLive = ref.isLive;
    }

    @Override
    public String toString() {
        return "Platform: " + platform + ", Is Live: " + isLive;
    }

}
