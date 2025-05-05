package com.lambdaworks.internal;

public class LengthFilter {
    public static void main(String[] args) {
        String[] arr = {"Java", "Lambda", "AI", "OpenAI"};

        int minLength = 4;

        LengthChecker lengthChecker=(str)->{
            if(str.length()>minLength){
                System.out.println("string "+str+" is greater than given length");
            }
            else{
                System.out.println("condition not satisfied");
            }
        };

        lengthChecker.check("krishna");

    }
}