package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.LeapYearValidationService;

public class LeapYearRunner {
    public static void main(String[] args) {
        new LeapYearValidationService().validateBirthdate("2023-02-29"); // Invalid leap day
    }
}
