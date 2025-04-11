package com.officechair;

public class OfficeChair  extends Chair {
    public OfficeChair() {
        System.out.println("Constructor of OfficeChair");
    }

    @Override
    public void sit() {
        System.out.println("Sitting comfortably on an office chair");
    }

    public void adjustHeight() {
        System.out.println("Adjusting chair height");
    }
}

