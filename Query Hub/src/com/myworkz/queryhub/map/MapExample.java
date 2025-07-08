package com.myworkz.queryhub.map;


import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map< Integer , String> map = new HashMap<>();
        map.put(1, "Krishna");
        map.put(2, "Uttam");
        map.put(3, "Raga");
        map.put(4, "Josh");

        System.out.println("User map :"+map);
        System.out.println("=========================");


        System.out.println("User with ID 2: "+map.get(2));
        System.out.println("\nAll users:");
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("ID "+entry.getKey() + " - Name: "+entry.getValue());
        }
        map.put(2, "Alan");
        System.out.println("\nafter Updating id 2 as Alan: "+map);


        map.remove(3);
        System.out.println("\nafter removing id 3: "+map);


        System.out.println("++++++++++++++ Using stream +++++++++++++++++");
        map.forEach((key,value)-> System.out.println(key+"  "+value));

        map.put(5,"Ela");
        map.put(6,"Ana");
        map.put(7,"Yateesh");
        map.put(8, "Gagan");
        map.values().forEach(System.out::println);
        System.out.println("Removed 6 Ana: "+map.remove(6,"Ana"));
        System.out.println("Replaced Yateesh: "+map.replace(7,"Yateesh","Raga"));

        System.out.println("Contains ID 3?: "+map.containsKey(3));
        System.out.println("get(4): "+map.get(4));

        map.clear();
        System.out.println("After clearing : "+map);

    }
}
