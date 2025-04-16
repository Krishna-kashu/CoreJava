package com.website;

public class Website {
    private String url;
    private boolean isSecure;
        public Website() {
            System.out.println("no-arg constructor of Website");
        }

        public void load() {
            System.out.println("Running load() in Website");
        }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setIsSecure(boolean isSecure) {
        this.isSecure = isSecure;
    }

    public Website(Website ref) {
        this.url = ref.url;
        this.isSecure = ref.isSecure;
    }

    @Override
    public String toString() {
        return "URL: " + url + ", Secure: " + isSecure;
    }

}