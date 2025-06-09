package com.mywork.exceptionWorld.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class AgeCalculatorService {
    public void calculateAge(String birthDateStr) {
        try {
            LocalDate birthDate = LocalDate.parse(birthDateStr);
            LocalDate today = LocalDate.now();
            int age = Period.between(birthDate, today).getYears();
            System.out.println("Age: " + age);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid birthdate format: " + e.getMessage());
        }
    }
}
