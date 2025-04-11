package com.website;

public class WebsiteRunner {
    public static void main(String[] args) {
        Website site = new Website();
        site.load();

        Website site1 = new Blog();
        site1.load();

        System.out.println("**********");

        Blog blog = new Blog();
        blog.load();
        blog.writePost();
    }
}
