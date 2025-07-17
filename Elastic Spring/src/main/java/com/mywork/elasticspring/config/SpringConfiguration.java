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

    @Bean
    public String stringRegister(){
    return "Hey";
    }

    @Bean
    public String string1() {
        return "Spring Boot";
    }

    @Bean
    public String string2() {
        return "Java";
    }

    @Bean
    public String string3() {
        return "Hibernate";
    }

    @Bean
    public String string4() {
        return "Spring MVC";
    }

    @Bean
    public String string5() {
        return "Servlet";
    }
    @Bean
    public Object object1() {
        return new Object();
    }

    @Bean
    public Object object2() {
        return new Object();
    }

    @Bean
    public Object object3() {
        return new Object();
    }

    @Bean
    public Object object4() {
        return new Object();
    }

    @Bean
    public Object object5() {
        return new Object();
    }
    @Bean
    public Integer integer1(){
        return 5;
    }

    @Bean
    public Integer integer2(){
        return 98;
    }

    @Bean
    public Double DoubleBean1(){
        return 5.6;
    }

    @Bean
    public Double DoubleBean2(){
        return 67845.6;
    }

    @Bean
    public Float floatBean1() {
        return 1.2f;
    }

    @Bean
    public Float floatBean2() {
        return 2.4f;
    }

    @Bean
    public Long longBean1() {
        return 100L;
    }

    @Bean
    public Long longBean2() {
        return 200L;
    }

    @Bean
    public Short shortBean1() {
        return 1;
    }

    @Bean
    public Short shortBean2() {
        return 2;
    }

    @Bean
    public Byte byteBean1() {
        return 3;
    }

    @Bean
    public Byte byteBean2() {
        return 4;
    }

    @Bean
    public Boolean booleanBean1() {
        return true;
    }

    @Bean
    public Boolean booleanBean2() {
        return false;
    }

    @Bean
    public Character charBean1() {
        return 'A';
    }

    @Bean
    public Character charBean2() {
        return 'B';
    }

    @Bean
    public ArrayList<String> arrayListBean() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Spring");
        list.add("Java");
        return list;
    }

    @Bean
    public LinkedList<Integer> linkedListBean(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(45);
        list.add(37);
        return  list;
    }

    @Bean
    public HashSet<Integer> hashSetBean(){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(867);
        hashSet.add(6743);
        return hashSet;
    }

    @Bean
    public LinkedHashSet<Integer> linkedHashSetBean(){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(7384);
        linkedHashSet.add(23);
        linkedHashSet.add(43);
        linkedHashSet.add(598);
        return linkedHashSet;
    }

    @Bean
    public  TreeMap<Integer, String> treeMapBean(){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(65, "Raga");
        treeMap.put(60, "Varun");
        return treeMap;
    }
    @Bean
    public TreeSet<String> treeSetBean() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        return set;
    }

    @Bean
    public HashMap<String, Integer> hashMapBean() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Math", 95);
        map.put("Science", 90);
        return map;
    }
    @Bean
    public LinkedHashMap<String, String> linkedHashMapBean() {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("One", "First");
        lhm.put("Two", "Second");
        return lhm;
    }
    @Bean
    public Properties propertiesBean() {
        Properties properties = new Properties();
        properties.setProperty("url", "jdbc:mysql://localhost:3306/db");
        properties.setProperty("username", "root");
        properties.setProperty("password", "1234");
        return properties;
    }

    @Bean
    public Hashtable<Integer, String> hashtableBean() {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Admin");
        ht.put(2, "User");
        return ht;
    }

    @Bean
    public String[] nameArrayBean() {
        return new String[]{"Amar", "Charan", "Harsh", "Diya", "Sara"};
    }

    @Bean
    public  String[] newNames(){
        return new String[]{"Shama", "Swathi", "Farina", "Tarak"};
    }
}