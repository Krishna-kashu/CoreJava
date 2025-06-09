package com.mywork.exceptionWorld.service;

import java.util.Scanner;

public class GameMenuService {
    public void displayMenu() {
        System.out.println("1. Start Game\n2. Load Game\n3. Exit");
        Scanner sc = new Scanner(System.in);
        try {
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Game Started!");
                    break;
                case 2:
                    System.out.println("Loading...");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Option.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}
