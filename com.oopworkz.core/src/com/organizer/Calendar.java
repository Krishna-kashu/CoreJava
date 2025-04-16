package com.organizer;

public class Calendar  {
    private String month;
    private int year;
    public Calendar() {
        System.out.println("Constructor of Calendar");
    }

    public void displayDate() {
        System.out.println("Showing date on calendar");
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Calendar(Calendar ref) {
        this.month = ref.month;
        this.year = ref.year;
    }

    @Override
    public String toString() {
        return "Month: " + month + ", Year: " + year;
    }

}
