package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.DateDifferenceService;

public class DateDifferenceRunner {
    public static void main(String[] args) {
        new DateDifferenceService().calculateDaysBetween("2002-12-24","2025-06-08");
        new DateDifferenceService().calculateDaysBetween("2023-03-01", null);
    }
}
