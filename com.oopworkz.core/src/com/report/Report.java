package com.report;

public class Report {
    private String title;
    private int pages;
    public Report() {
        System.out.println("no-arg constructor of Report");
    }

    public void generate() {
        System.out.println("Running generate() in Report");
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Report(Report ref) {
        this.title = ref.title;
        this.pages = ref.pages;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Pages: " + pages;
    }

}
