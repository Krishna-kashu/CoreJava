package com.myworkz.queryhub.task;

import java.util.*;

public class CollectionTask {
    public static void main(String[] args) {

        Collection<Integer> list = new ArrayList<>();
        for(int i =1; i<=10; i++)
            list.add(i);
        System.out.println("\n1. array list: "+ list);

        Collection<String> cities = new LinkedList<>();
        cities.add("Bengaluru");
        cities.add("Udupi");
        cities.add("Mysuru");
        cities.add("Hasan");
        cities.add("Davanagere");

        System.out.println("\n"+cities);
        for(String city: cities){
            System.out.println("2. "+city);
        }

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 60, 30, 90, 25));
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("\n"+numbers);
        while (iterator.hasNext()) {
            if (iterator.next() > 50) iterator.remove();
        }
        System.out.println("\n3. After removing > 50: " + numbers);

        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Apple");
        System.out.println("\n 4. Fruits set: " + fruits);

        List<String> lang = Arrays.asList("Python", "JavaScript", "Java");
        System.out.println("\n5. Contains 'Java'? " + lang.contains("Java"));

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(15);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(10);
        System.out.println("\n6. LinkedHashSet order: " + linkedHashSet);

        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("Zebra", "Apple", "Monkey", "Ball"));
        Collections.sort(alphabets);
        System.out.println("\n7. Sorted list: " + alphabets);

        HashSet<String> hashSet = new HashSet<>();
        System.out.println("8. Is set empty? " + hashSet.isEmpty());

        TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("USA");
        countries.add("France");
        System.out.println("9. Countries (sorted): " + countries);

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(11, 22, 33, 44));
        arrayList.add(2, 99);
        System.out.println("10. After inserting 99 at index 2: " + arrayList);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("11. Size of list: " + list1.size());

        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
        hashSet1.remove(6);
        System.out.println("12. After removing 6: " + hashSet1);

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(88, 11, 55, 22, 99));
        System.out.println("13. Sorted TreeSet: " + treeSet);

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("One", "Two", "Three"));
        linkedList.set(1, "UpdatedValue");
        System.out.println("14. After replacement: " + linkedList);

        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        arrayList1.clear();
        System.out.println("15. After clearing: " + arrayList1);

        HashSet<String> set1 = new HashSet<>(Arrays.asList("Apple", "Banana", "Mango"));
        System.out.println("16. Contains 'Banana'? " + set1.contains("Banana"));

        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Doe", "Alice"));
        HashSet<String> copiedSet = new HashSet<>(names);
        System.out.println("17. Copied HashSet: " + copiedSet);

        TreeSet<Integer> tree = new TreeSet<>(Arrays.asList(10, 30, 50, 70));
        System.out.println("18. First: " + tree.first() + ", Last: " + tree.last());

        List<String> words = Arrays.asList("A", "B", "C");
        System.out.println("19. Elements with index:");
        for (int i = 0; i < words.size(); i++) {
            System.out.println("\t"+i + ": " + words.get(i));
        }

        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Red");
        linkedSet.add("Green");
        linkedSet.add("Blue");
        Iterator<String> it = linkedSet.iterator();
        System.out.print("20. Iterating: ");
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();

        List<Integer> nums = Arrays.asList(11, 99, 33, 77);
        System.out.println("21. Max number: " + Collections.max(nums));

        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(10, 60, 30, 80, 20));
        Iterator<Integer> it2 = ts.iterator();
        while (it2.hasNext()) {
            if (it2.next() < 50) it2.remove();
        }
        System.out.println("22. After removing < 50: " + ts);

        HashSet<String> hashFruits = new HashSet<>(Arrays.asList("Kiwi", "Peach", "Lime"));
        List<String> listFruits = new ArrayList<>(hashFruits);
        System.out.println("23. Converted List: " + listFruits);

        ArrayList<String> reverseList = new ArrayList<>(Arrays.asList("Sun", "Moon", "Star"));
        Collections.reverse(reverseList);
        System.out.println("24. Reversed list: " + reverseList);

        LinkedList<String> greetings = new LinkedList<>(Arrays.asList("Hi", "Hello", "Hey"));
        System.out.println("25. Contains 'Hello'? " + greetings.contains("Hello"));
    }
}