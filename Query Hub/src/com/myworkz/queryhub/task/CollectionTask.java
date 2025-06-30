package com.myworkz.queryhub.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionTask {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        for(int i =1; i<=10; i++)
            list.add(i);
        System.out.println("array list: "+ list);

        Collection<String> cities = new LinkedList<>();
        cities.add("Bengaluru");
        cities.add("Udupi");
        cities.add("Mysuru");
        cities.add("Hasan");
        cities.add("Davanagere");

        for(String city: cities){
            System.out.println(city);
        }

    }
}
