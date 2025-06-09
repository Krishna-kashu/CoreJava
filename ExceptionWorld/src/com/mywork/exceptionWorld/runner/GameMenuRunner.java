package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.GameMenuService;

public class GameMenuRunner {
    public static void main(String[] args) {
        new GameMenuService().displayMenu();
    }
}
