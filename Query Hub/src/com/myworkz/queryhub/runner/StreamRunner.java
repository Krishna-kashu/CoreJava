package com.myworkz.queryhub.runner;

import java.util.ArrayList;
import java.util.Collection;

public class StreamRunner
{
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(23);
        collection.add(15);
        collection.add(38);
        collection.add(49);
        collection.add(62);
        collection.add(78);
        collection.add(93);
        collection.add(59);

        System.out.println(collection);
        Collection<Integer> newList = new ArrayList<>();
        for(Integer i : collection){
            if(i>50){
                System.out.println("Integer > 50: "+i);
                newList.add(i);
            }
        }
        System.out.println("List of Integers > 50 : "+newList);
    }
}
