package com.mywork.guessNumber.runner;

import java.util.Random;
import java.util.Scanner;

public class NumberRunner {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("random number"+randomNumber);
        Scanner scanner = new Scanner(System.in);
        boolean guess = false;

        while (!guess){
            System.out.println("Enter a number: ");

            try{
                int userGuessedNumber = scanner.nextInt();
                if(userGuessedNumber == randomNumber){
                    System.out.println("Congratulations you guessed correctly");
                    guess = true;
                }else {
                    System.out.println("Your guess is wrong, Try again");
                }

            }catch (Exception ex){
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
