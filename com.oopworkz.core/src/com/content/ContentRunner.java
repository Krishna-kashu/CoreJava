package com.content;

public class ContentRunner {
    public static void main(String[] args) {
        Content content = new Content();
        content.display();

        Content content1 = new VideoContent();
        content1.display();

        System.out.println("**********");

        VideoContent video = new VideoContent();
        video.display();
        video.playInFullScreen();
        Content content2 = new Content("Artificial Intelligence Tutorial", "Video");
        Content content3 = new Content(content2);
        System.out.println(content3);

    }
}
