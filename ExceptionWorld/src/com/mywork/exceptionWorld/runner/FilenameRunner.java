package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.FilenameService;

public class FilenameRunner {
    public static void main(String[] args) {
        System.out.println(new FilenameService().getExtension("file"));
    }
}
