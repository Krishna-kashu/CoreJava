package com.mywork.exceptionWorld.service;

import com.mywork.exceptionWorld.exception.AgeNotEligibleException;

import java.time.LocalDate;
import java.time.Period;

public class LoanApplicationService {
    public void applyLoan(String dobStr) throws AgeNotEligibleException {
        try {
            LocalDate dob = LocalDate.parse(dobStr);
            int age = Period.between(dob, LocalDate.now()).getYears();

            if (age < 21 || age > 60) {
                throw new AgeNotEligibleException("Age " + age + " is not eligible for loan (must be 21–60)");
            }

            System.out.println("Loan application accepted. Age: " + age);
        } catch (Exception e) {
            System.out.println("Error in loan processing: " + e.getMessage());
        }
    }
}
