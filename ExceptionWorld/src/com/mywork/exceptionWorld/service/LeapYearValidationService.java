package com.mywork.exceptionWorld.service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class LeapYearValidationService {
    public void validateBirthdate(String birthDateStr) {
        try {
            LocalDate date = LocalDate.parse(birthDateStr); // yyyy-MM-dd
            System.out.println("Valid birthdate: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid birthdate (possible non-leap year issue): " + e.getMessage());
        }
    }
}
