package com.mywork.exceptionWorld.service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DateDifferenceService {
    public void calculateDaysBetween(String startDateStr, String endDateStr) {
        try {
            LocalDate startDate = LocalDate.parse(startDateStr);
            LocalDate endDate = LocalDate.parse(endDateStr);
            long days = ChronoUnit.DAYS.between(startDate, endDate);
            System.out.println("Days between: " + days);
        } catch (NullPointerException e) {
            System.out.println("Error: One of the dates is null.");
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid date format - " + e.getMessage());
        }
    }
}
