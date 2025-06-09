package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.exception.AgeNotEligibleException;
import com.mywork.exceptionWorld.service.LoanApplicationService;

public class LoanApplicationRunner {
    public static void main(String[] args) {
        LoanApplicationService service = new LoanApplicationService();
        try {
            service.applyLoan("2008-12-10");
        } catch (AgeNotEligibleException e) {
            System.out.println("Application rejected: " + e.getMessage());
        }
    }
}
