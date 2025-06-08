package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.BackUpService;

public class BackupRunner {
    public static void main(String[] args) {
        new BackUpService().loadConfig();
    }
}
