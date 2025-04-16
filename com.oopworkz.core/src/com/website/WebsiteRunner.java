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

        Website website = new Website();
        website.setUrl("https://openai.com");
        website.setIsSecure(true);

        Website site2 = new Website(website);
        System.out.println(site2);

    }
}
