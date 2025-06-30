package com.myworkz.queryhub.task;

import java.util.*;

public class CollectionTask {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        for(int i =1; i<=10; i++)
            list.add(i);
        System.out.println("\narray list: "+ list);

        Collection<String> cities = new LinkedList<>();
        cities.add("Bengaluru");
        cities.add("Udupi");
        cities.add("Mysuru");
        cities.add("Hasan");
        cities.add("Davanagere");

        System.out.println("\n"+cities);
        for(String city: cities){
            System.out.println(city);
        }

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 60, 30, 90, 25));
        Iterator<Integer> iterator = numbers.iterator();

        System.out.println("\n"+numbers);
        while (iterator.hasNext()) {
            if (iterator.next() > 50) iterator.remove();
        }
        System.out.println("\nAfter removing > 50: " + numbers);

        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Apple");
        System.out.println("\n Fruits set: " + fruits);

        List<String> lang = Arrays.asList("Python", "JavaScript", "Java");
        System.out.println("\n Contains 'Java'? " + lang.contains("Java"));

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(15);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(10);
        System.out.println("\nLinkedHashSet order: " + linkedHashSet);

        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("Zebra", "Apple", "Monkey", "Ball"));
        Collections.sort(alphabets);
        System.out.println("\n Sorted list: " + alphabets);

        HashSet<String> hashSet = new HashSet<>();
        System.out.println("Is set empty? " + hashSet.isEmpty());

        TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("USA");
        countries.add("France");
        System.out.println("Countries (sorted): " + countries);

    }
}
