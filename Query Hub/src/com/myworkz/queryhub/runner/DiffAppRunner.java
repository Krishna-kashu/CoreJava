package com.myworkz.queryhub.runner;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DiffAppRunner {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Instagram");
        list.add("Netflix");
        list.add("What's App");
        list.add("Telegram");
        list.add("Snap chat");
        list.add("Google Photos");

       ListIterator<String> listIterator=list.listIterator();

       while(listIterator.hasNext()){
           System.out.println(listIterator.next());
       }
        System.out.println("@@@@@@");
       ListIterator<String> listIterator1=list.listIterator(4);
       while(listIterator1.hasPrevious()){
           System.out.println(listIterator1.previous());
       }
        System.out.println("+++++++++++++++++++++++");
       while(listIterator.hasPrevious()){
           System.out.println(listIterator.previous());
       }
       System.out.println("======================");
       listIterator.set("Phone Pay");
       while (listIterator.hasPrevious()){
           System.out.println(listIterator.previous());
       }
        System.out.println("================");

        listIterator.set("Phone Pay");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}