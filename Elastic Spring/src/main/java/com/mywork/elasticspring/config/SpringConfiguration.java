package com.mywork.elasticspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan(basePackages = "com.mywork.elasticspring.component")
public class SpringConfiguration {
    public SpringConfiguration() {
        System.out.println("created SpringConfiguration...");
    }

    //@Bean
    public String stringRegister(){
        System.out.println("StringRegister");
    return "Hey";
    }

    //@Bean
    public String string1() {
        System.out.println("String 1");
        return "Spring Boot";
    }

    @Bean
    public String string2() {
        System.out.println("String 2");
        return "Java";
    }

    @Bean
    public String string3() {
        System.out.println("String 3");
        return "Hibernate";
    }

    @Bean
    public String string4() {
        System.out.println("String 4");
        return "Spring MVC";
    }

    @Bean
    public String string5() {
        System.out.println("String 5");
        return "Servlet";
    }
    @Bean
    public Object object1() {
        System.out.println("Object 1");
        return new Object();
    }

    @Bean
    public Object object2() {
        System.out.println("Object 2");
        return new Object();
    }

    @Bean
    public Object object3() {
        System.out.println("Object 3");
        return new Object();
    }

    @Bean
    public Object object4() {
        System.out.println("Object 4");
        return new Object();
    }

    @Bean
    public Object object5() {
        System.out.println("Object 5");
        return new Object();
    }
    @Bean
    public Integer integer1(){
        System.out.println("Integer 1");
        return 5;
    }

    @Bean
    public Integer integer2(){
        System.out.println("Integer 2");
        return 57;
    }

    @Bean
    public Double DoubleBean1(){
        System.out.println("Double 1");
        return 67845.6;
    }

    @Bean
    public Double DoubleBean2(){
        System.out.println("Double 2");
        return 536782.5;
    }

    @Bean
    public Float floatBean1() {
        System.out.println("Float 1");
        return 1.2f;
    }

    @Bean
    Float floatBean2() {
        System.out.println("Float 2");
        return 2.4f;
    }

    @Bean
    public Long longBean1() {
        System.out.println("Long 1");
        return 100L;
    }

    @Bean
    public Long longBean2() {
        System.out.println("Long 2");
        return 200L;
    }

    @Bean
    public Short shortBean1() {
        System.out.println("Short 1");
        return 1;
    }

    @Bean
    public Short shortBean2() {
        System.out.println("Short 2");
        return 2;
    }

    @Bean
    public Byte byteBean1() {
        System.out.println("Byte 1");
        return 3;
    }

    @Bean
    public Byte byteBean2() {
        System.out.println("Byte 2");
        return 4;
    }

    @Bean
    public Boolean booleanBean1() {
        System.out.println("Boolean 1");
        return true;
    }

    @Bean
    public Boolean booleanBean2() {
        System.out.println("Boolean 2");
        return false;
    }

    @Bean
    public Character charBean1() {
        System.out.println("Character 1");
        return 'A';
    }

    @Bean
    public Character charBean2() {
        System.out.println("Character 2");
        return 'B';
    }

    @Bean
    public ArrayList<String> arrayList1() {
        System.out.println("ArrayList<String> 1");
        return new ArrayList<>(Arrays.asList("Spring", "Java"));
    }

    @Bean
    public ArrayList<Integer> arrayList2() {
        System.out.println("ArrayList<Integer> 2");
        return new ArrayList<>(Arrays.asList(24, 56, 983));
    }

    @Bean
    public ArrayList<Double> arrayList3() {
        System.out.println("ArrayList<Double> 3");
        return new ArrayList<>(Arrays.asList(34.5, 564.7));
    }

    @Bean
    public ArrayList<String> arrayList4() {
        System.out.println("ArrayList<String> 4");
        return new ArrayList<>(Arrays.asList("SQL", "NoSQL"));
    }

    @Bean
    public ArrayList<String> arrayList5() {
        System.out.println("ArrayList<String> 5");
        return new ArrayList<>(Arrays.asList("Collection", "Stream"));
    }

    @Bean
    public LinkedList<Integer> linkedList1() {
        System.out.println("LinkedList<Integer>  1");
        return new LinkedList<>(Arrays.asList(10, 20));
    }

    @Bean
    public LinkedList<Integer> linkedList2() {
        System.out.println("LinkedList<Integer>  2");
        return new LinkedList<>(Arrays.asList(30, 40));
    }

    @Bean
    public LinkedList<Integer> linkedList3() {
        System.out.println("LinkedList<Integer>  3");
        return new LinkedList<>(Arrays.asList(50, 60));
    }

    @Bean
    public LinkedList<Integer> linkedList4() {
        System.out.println("LinkedList<Integer>  4");
        return new LinkedList<>(Arrays.asList(70, 80));
    }

    @Bean
    public LinkedList<Integer> linkedList5() {
        System.out.println("LinkedList<Integer>  5");
        return new LinkedList<>(Arrays.asList(90, 100));
    }

    @Bean
    public HashSet<Integer> hashSet1() {
        System.out.println("HashSet<Integer>  1");
        return new HashSet<>(Arrays.asList(1, 2));
    }

    @Bean
    public HashSet<Integer> hashSet2() {
        System.out.println("HashSet<Integer>  2");
        return new HashSet<>(Arrays.asList(3, 4));
    }

    @Bean
    public HashSet<Integer> hashSet3() {
        System.out.println("HashSet<Integer>  3");
        return new HashSet<>(Arrays.asList(5, 6));
    }

    @Bean
    public HashSet<Integer> hashSet4() {
        System.out.println("HashSet<Integer>  4");
        return new HashSet<>(Arrays.asList(7, 8));
    }

    @Bean
    public HashSet<Integer> hashSet5() {
        System.out.println("HashSet<Integer>  5");
        return new HashSet<>(Arrays.asList(9, 10));
    }

    @Bean
    public LinkedHashSet<Integer> linkedHashSetBean(){
        System.out.println("LinkedHashSet<Integer>  1");
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(7384);
        linkedHashSet.add(23);
        linkedHashSet.add(43);
        linkedHashSet.add(598);
        return linkedHashSet;
    }

    @Bean
    public LinkedHashSet<Integer> linkedHashSet2() {
        System.out.println("LinkedHashSet<Integer>  2");
        return new LinkedHashSet<>(Arrays.asList(103, 104));
    }

    @Bean
    public LinkedHashSet<Integer> linkedHashSet3() {
        System.out.println("LinkedHashSet<Integer>  3");
        return new LinkedHashSet<>(Arrays.asList(105, 106));
    }

    @Bean
    public LinkedHashSet<Integer> linkedHashSet4() {
        System.out.println("LinkedHashSet<Integer>  4");
        return new LinkedHashSet<>(Arrays.asList(107, 108));
    }

    @Bean
    public LinkedHashSet<Integer> linkedHashSet5() {
        System.out.println("LinkedHashSet<Integer>  5");
        return new LinkedHashSet<>(Arrays.asList(109, 110));
    }


    @Bean
    public  TreeMap<Integer, String> treeMapBean(){
        System.out.println("TreeMap<Integer, String>  1");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(65, "Raga");
        treeMap.put(60, "Varun");
        return treeMap;
    }
    @Bean
    public TreeMap<Integer, String> treeMap2() {
        System.out.println("TreeMap<Integer, String>  2");
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        return map;
    }

    @Bean
    public TreeMap<Integer, String> treeMap3() {
        System.out.println("TreeMap<Integer, String>  3");
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Three");
        map.put(4, "Four");
        return map;
    }

    @Bean
    public TreeMap<Integer, String> treeMap4() {
        System.out.println("TreeMap<Integer, String>  4");
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(5, "Five");
        map.put(6, "Six");
        return map;
    }

    @Bean
    public TreeMap<Integer, String> treeMap5() {
        System.out.println("TreeMap<Integer, String>  5");
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(7, "Seven");
        map.put(8, "Eight");
        return map;
    }


    @Bean
    public TreeSet<String> treeSet1() {
        System.out.println("TreeSet<String>  1");
        return new TreeSet<>(Arrays.asList("A", "B"));
    }

    @Bean
    public TreeSet<String> treeSet2() {
        System.out.println("TreeSet<String>  2");
        return new TreeSet<>(Arrays.asList("C", "D"));
    }

    @Bean
    public TreeSet<String> treeSet3() {
        System.out.println("TreeSet<String>  3");
        return new TreeSet<>(Arrays.asList("E", "F"));
    }

    @Bean
    public TreeSet<String> treeSet4() {
        System.out.println("TreeSet<String>  4");
        return new TreeSet<>(Arrays.asList("G", "H"));
    }

    @Bean
    public TreeSet<String> treeSet5() {
        System.out.println("TreeSet<String>  5");
        return new TreeSet<>(Arrays.asList("I", "J"));
    }


    @Bean
    public HashMap<String, Integer> hashMap1() {
        System.out.println("HashMap<String, Integer>  1");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Key57", 898);
        map.put("Key67", 864);
        return map;
    }

    @Bean
    public HashMap<String, Integer> hashMap2() {
        System.out.println("HashMap<String, Integer>  2");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Key1", 100);
        map.put("Key2", 200);
        return map;
    }

    @Bean
    public HashMap<String, Integer> hashMap3() {
        System.out.println("HashMap<String, Integer>  3");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Key3", 7656);
        map.put("Key4", 9654);
        return map;
    }

    @Bean
    public HashMap<String, Integer> hashMap4() {
        System.out.println("HashMap<String, Integer>  4");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Key6", 87);
        map.put("Key7", 57);
        return map;
    }

    @Bean
    public HashMap<String, Integer> hashMap5() {
        System.out.println("HashMap<String, Integer>  5");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Key4", 932);
        map.put("Key5", 508);
        return map;
    }

    @Bean
    public HashMap<String, Integer> hashMapBean() {
        System.out.println("HashMap<String, Integer>  6");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Math", 95);
        map.put("Science", 90);
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap1() {
        System.out.println("LinkedHashMap<String, Integer>  1");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("A", "Apple");
        map.put("B", "Ball");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap2() {
        System.out.println("LinkedHashMap<String, Integer>  2");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("C", "Cat");
        map.put("D", "Dog");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap3() {
        System.out.println("LinkedHashMap<String, Integer>  2");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("E", "Elephant");
        map.put("F", "Fish");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap4() {
        System.out.println("LinkedHashMap<String, Integer>  3");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("G", "Goat");
        map.put("H", "Horse");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap5() {
        System.out.println("LinkedHashMap<String, Integer>  4");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("I", "Ink");
        map.put("J", "Jug");
        return map;
    }



    @Bean
    public LinkedHashMap<String, String> linkedHashMapBean() {
        System.out.println("LinkedHashMap<String, Integer>  5");
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("One", "First");
        lhm.put("Two", "Second");
        return lhm;
    }
    @Bean
    public Properties propertiesBean() {
        System.out.println("Properties  1");
        Properties properties = new Properties();
        properties.setProperty("url", "jdbc:mysql://localhost:3306/db");
        properties.setProperty("username", "root");
        properties.setProperty("password", "1234");
        return properties;
    }
    @Bean
    public Properties properties1() {
        System.out.println("Properties  2");
        Properties p = new Properties();
        p.setProperty("env", "dev");
        return p;
    }

    @Bean
    public Properties properties2() {
        System.out.println("Properties  3");
        Properties p = new Properties();
        p.setProperty("env", "test");
        return p;
    }

    @Bean
    public Properties properties3() {
        System.out.println("Properties  4");
        Properties p = new Properties();
        p.setProperty("env", "stage");
        return p;
    }

    @Bean
    public Properties properties4() {
        System.out.println("Properties  5");
        Properties p = new Properties();
        p.setProperty("env", "prod");
        return p;
    }

    @Bean
    public Properties properties5() {
        System.out.println("Properties  6");
        Properties p = new Properties();
        p.setProperty("env", "local");
        return p;
    }


    @Bean
    public Hashtable<Integer, String> hashtableBean() {
        System.out.println("Hashtable<Integer, String>  1");
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Admin");
        ht.put(2, "User");
        return ht;
    }

    @Bean
    public Hashtable<Integer, String> hashtable1() {
        System.out.println("Hashtable<Integer, String>  2");
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "A");
        return ht;
    }

    @Bean
    public Hashtable<Integer, String> hashtable2() {
        System.out.println("Hashtable<Integer, String>  3");
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(2, "B");
        return ht;
    }

    @Bean
    public Hashtable<Integer, String> hashtable3() {
        System.out.println("Hashtable<Integer, String>  4");
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(3, "C");
        return ht;
    }

    @Bean
    public Hashtable<Integer, String> hashtable4() {
        System.out.println("Hashtable<Integer, String>  5");
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(4, "D");
        return ht;
    }

    @Bean
    public Hashtable<Integer, String> hashtable5() {
        System.out.println("Hashtable<Integer, String>  6");
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(5, "E");
        return ht;
    }


    @Bean
    public String[] nameArrayBean() {
        System.out.println("String[]  1");
        return new String[]{"Amar", "Charan", "Harsh", "Diya", "Sara"};
    }

    @Bean
    public  String[] newNames(){
        System.out.println("String[]  2");
        return new String[]{"Shama", "Swathi", "Farina", "Tarak"};
    }
}