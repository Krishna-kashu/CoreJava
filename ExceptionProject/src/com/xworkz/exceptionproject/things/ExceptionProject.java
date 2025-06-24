package com.xworkz.exceptionproject.things;

public class ExceptionProject {

    public static void main(String[] args) {

        try{

            throw new NullPointerException("Null Pointer Exception");
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
