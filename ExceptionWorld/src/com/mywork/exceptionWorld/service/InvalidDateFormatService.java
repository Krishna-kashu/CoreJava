package com.mywork.exceptionWorld.service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class InvalidDateFormatService {
    public void parseDate(String dateStr) {
        try {
            LocalDate date = LocalDate.parse(dateStr);
            System.out.println("Parsed Date: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format: " + e.getMessage());
        }
    }
}
