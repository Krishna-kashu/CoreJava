package com.mywork.exceptionWorld.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RatingService {
    public void acceptRating(){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter Rating 1 to 5");
            int rating = scanner.nextInt();
            if(rating <1 || rating > 5){
                System.out.println("Rating must be between 1 to 5. ");
            }else{
                System.out.println("You Rated: "+rating);
            }
        }catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter a number. ");
        }
    }
}
