package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.InvalidDateFormatService;

public class InvalidDateRunner {
    public static void main(String[] args) {
        new InvalidDateFormatService().parseDate("31-02-2022");
        new InvalidDateFormatService().parseDate("2022-02-01");
    }
}
