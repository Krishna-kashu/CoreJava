package com.myworkz.queryhub.task;

import java.util.*;

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

        System.out.println(cities);
        for(String city: cities){
            System.out.println(city);
        }

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 60, 30, 90, 25));
        Iterator<Integer> iterator = numbers.iterator();

        System.out.println(numbers);
        while (iterator.hasNext()) {
            if (iterator.next() > 50) iterator.remove();
        }
        System.out.println("After removing > 50: " + numbers);

        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Apple");
        System.out.println(" Fruits set: " + fruits);

        List<String> lang = Arrays.asList("Python", "JavaScript", "Java");
        System.out.println(" Contains 'Java'? " + lang.contains("Java"));

    }
}
