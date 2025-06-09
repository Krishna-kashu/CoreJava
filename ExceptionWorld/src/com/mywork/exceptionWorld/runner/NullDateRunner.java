package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.NullDateService;

public class NullDateRunner {
    public static void main(String[] args) {
        new NullDateService().formatDate(null);
    }
}
