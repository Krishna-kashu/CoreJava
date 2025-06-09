package com.mywork.exceptionWorld.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NullDateService {
    public void formatDate(LocalDate date) {
        try {
            String formatted = date.format(DateTimeFormatter.ISO_DATE);
            System.out.println("Formatted date: " + formatted);
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot format null date.");
        }
    }
}
