package com.myworkz.queryhub.guest;

import java.util.*;

public class GuestList {
    public static void main(String[] args) {

        System.out.println("\n\n++++++++++++++++++++++++ HashSet ++++++++++++++++++++++++\n\n");

        Collection<String> event1 = new HashSet<>();
        event1.add(null);
        event1.add("Krishna");
        event1.add("Rishi");
        event1.add("John");
        event1.add("Gagan");
        event1.add("Gagan");
        event1.add("Ela");
        event1.add("Lasya");
        event1.add("kiran");
        event1.add("Sameer");
        event1.add("Bharat");
        event1.add("Radha");
        event1.add(null);

        System.out.println(event1);

        event1.remove("Lasya");
        System.out.println(event1);
        boolean rishi = event1.contains("Rishi");
        System.out.println("Rishi name is there "+rishi);

        //boolean b = event1.containsAll(event1);
        //System.out.println("contains all"+b);

        System.out.println("size of even1: "+event1.size());

        System.out.println("\n\n++++++++++++++++++++++++ TreeSet ++++++++++++++++++++++++\n\n");
        Set<String> event2 = new TreeSet<>();
        event2.add("Ram");
        event2.add("Joshi");
        event2.add("John");
        event2.add("George");
        event2.add("Neel");
        event2.add("Ela");
        event2.add("Esa");
        event2.add("Sharma");
        event2.add("Patel");
        event2.add("Shashi");
        event2.add("Tarun");
        //event2.add(null);

        System.out.println(event2);
        event2.remove("Tarun");
        System.out.println(event2);
        boolean c = event1.containsAll(event2);
        System.out.println("event1 = event2 : "+c);
        System.out.println("size of even2: "+event2.size());
        event2.clear();
        System.out.println("event2: "+event2);

        System.out.println("\n\n++++++++++++++++++++++++ LinkedHashSet ++++++++++++++++++++++++\n\n");

        Set<String> event3 = new LinkedHashSet<>();
        event3.add(null);
        event3.add("Rahul");
        event3.add("Karan");
        event3.add("Sarayu");
        event3.add("Gagan");
//        event3.add("Gagan");
        event3.add("Ranjith");
        event3.add("Vandana");
        event3.add("Dhanu");
        event3.add("Sameena");
        event3.add("Kaushik");
        event3.add("Archana");
        event3.add(null);

        System.out.println("size of even3: "+event3.size());
        System.out.println(event3);
        event3.remove("Gagan");
        System.out.println(event3);
        event3.removeAll(event1);
        System.out.println("after removeAll: "+event3);
        boolean empty = event3.isEmpty();
        System.out.println("is empty: "+empty);

    }
}
