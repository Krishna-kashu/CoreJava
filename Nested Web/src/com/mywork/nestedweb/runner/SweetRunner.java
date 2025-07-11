package com.mywork.nestedweb.runner;

import com.mywork.nestedweb.dto.SweetDTO;

import java.util.*;

public class SweetRunner {
    public static void main(String[] args) {

        Set<SweetDTO> sweet = new HashSet<>();

        String[] ingredient1  = new String[]{"Sugar", "Milk", "Cardamom", "Ghee", "flour"};
        sweet.add(new SweetDTO("Mysore Pak", ingredient1, 40, 1300, 4));

        sweet.add(new SweetDTO("Mysore Pak", new String[]{"Besan", "Sugar", "Ghee", "Almonds", "Rose water"}, 50, 1250, 5));

        sweet.add(new SweetDTO("Rava Kesari", new String[]{"Rava", "Sugar", "Ghee", "Cashews", "Saffron"}, 30, 800, 4));

        String[] ingredient4  = new String[]{"Rava", "Jaggery", "Coconut", "Cardamom", "Ghee"};
        sweet.add(new SweetDTO("Rava Kesari", ingredient4, 35, 850, 4));

        String[] ingredient5  = new String[]{"Rice", "Jaggery", "Coconut", "Cardamom", "Ghee"};
        sweet.add(new SweetDTO("Kajjaya", ingredient5, 25, 700, 4));

        String[] ingredient6  = new String[]{"Rice flour", "Banana", "Jaggery", "Sesame", "Coconut"};
        sweet.add(new SweetDTO("Kajjaya", ingredient6, 30, 750, 3));

        String[] ingredient7  = new String[]{"Maida", "Sugar", "Ghee", "Curd", "Baking soda"};
        sweet.add(new SweetDTO("Balushahi", ingredient7, 45, 1000, 4));

        String[] ingredient8  = new String[]{"Maida", "Jaggery", "Butter", "Milk", "Cardamom"};
        sweet.add(new SweetDTO("Balushahi", ingredient8, 50, 980, 3));

        String[] ingredient9  = new String[]{"Chana Dal", "Jaggery", "Cardamom", "Ghee", "Rice flour"};
        sweet.add(new SweetDTO("Obbattu", ingredient9, 40, 900, 5));

        String[] ingredient10 = new String[]{"Toor Dal", "Sugar", "Coconut", "Cardamom", "Maida"};
        sweet.add(new SweetDTO("Obbattu", ingredient10, 45, 950, 4));

        String[] ingredient11 = new String[]{"Milk", "Sugar", "Paneer", "Lemon juice", "Rose water"};
        sweet.add(new SweetDTO("Rasgulla", ingredient11, 60, 700, 5));

        String[] ingredient12 = new String[]{"Milk powder", "Citric acid", "Sugar", "Saffron", "Rose essence"};
        sweet.add(new SweetDTO("Rasgulla", ingredient12, 55, 730, 4));

        String[] ingredient13 = new String[]{"Milk", "Sugar", "Vermicelli", "Cashew", "Raisin"};
        sweet.add(new SweetDTO("Payasa", ingredient13, 30, 650, 5));

        String[] ingredient14 = new String[]{"Broken wheat", "Jaggery", "Milk", "Dry fruits", "Coconut milk"};
        sweet.add(new SweetDTO("Payasa", ingredient14, 35, 700, 5));

        String[] ingredient15 = new String[]{"Gram flour", "Sugar", "Cardamom", "Cashew", "Ghee"};
        sweet.add(new SweetDTO("Besan Ladoo", ingredient15, 25, 500, 4));

        String[] ingredient16 = new String[]{"Besan", "Jaggery", "Almond", "Nutmeg", "Ghee"};
        sweet.add(new SweetDTO("Besan Ladoo", ingredient16, 30, 550, 3));

        String[] ingredient17 = new String[]{"Ragi flour", "Jaggery", "Grated coconut", "Ghee", "Dry fruits"};
        sweet.add(new SweetDTO("Ragi Laddu", ingredient17, 28, 480, 4));

        String[] ingredient18 = new String[]{"Ragi", "Palm sugar", "Dates", "Coconut", "Cashews"};
        sweet.add(new SweetDTO("Ragi Laddu", ingredient18, 32, 460, 4));

        String[] ingredient19 = new String[]{"Coconut", "Jaggery", "Cardamom", "Ghee"};
        sweet.add(new SweetDTO("Thenginakai Burfi", ingredient19, 25, 600, 4));

        String[] ingredient20 = new String[]{"Coconut", "Condensed milk", "Sugar", "Vanilla essence"};
        sweet.add(new SweetDTO("Thenginakai Burfi", ingredient20, 30, 620, 4));

        String[] ingredient21 = new String[]{"Milk", "Sugar", "Cocoa", "Ghee", "Maida"};
        sweet.add(new SweetDTO("Chocolate Burfi", ingredient21, 40, 800, 4));

        String[] ingredient22 = new String[]{"Milk powder", "Cocoa", "Condensed milk", "Butter"};
        sweet.add(new SweetDTO("Chocolate Burfi", ingredient22, 45, 850, 5));

        String[] ingredient23 = new String[]{"Moong dal", "Ghee", "Sugar", "Cashews", "Saffron"};
        sweet.add(new SweetDTO("Moong Dal Halwa", ingredient23, 50, 1200, 5));

        String[] ingredient24 = new String[]{"Moong dal", "Jaggery", "Ghee", "Milk", "Almonds"};
        sweet.add(new SweetDTO("Moong Dal Halwa", ingredient24, 48, 1150, 4));

        String[] ingredient25 = new String[]{"Maida", "Sugar", "Ghee", "Fennel seeds", "Milk"};
        sweet.add(new SweetDTO("Chiroti", ingredient25, 55, 1000, 5));

        String[] ingredient26 = new String[]{"Wheat flour", "Sugar", "Cardamom", "Ghee", "Sooji"};
        sweet.add(new SweetDTO("Chiroti", ingredient26, 50, 950, 4));

        String[] ingredient27 = new String[]{"Milk", "Sugar", "Lemon juice", "Rose water", "Saffron"};
        sweet.add(new SweetDTO("Basundi", ingredient27, 40, 850, 4));

        String[] ingredient28 = new String[]{"Milk", "Condensed milk", "Cardamom", "Pistachio", "Kesar"};
        sweet.add(new SweetDTO("Basundi", ingredient28, 42, 880, 5));

        String[] ingredient29 = new String[]{"Sabudana", "Jaggery", "Coconut milk", "Cardamom"};
        sweet.add(new SweetDTO("Sabakki Payasa", ingredient29, 35, 600, 4));

        String[] ingredient30 = new String[]{"Sabudana", "Milk", "Sugar", "Saffron", "Dry fruits"};
        sweet.add(new SweetDTO("Sabakki Payasa", ingredient30, 37, 620, 5));

        System.out.println("\n4. Sort all elements by price in desc using TreeSet\n");
        Set<SweetDTO> sweetDTOS = new TreeSet<>(Comparator.comparingDouble(SweetDTO::getPrice).reversed());
        sweetDTOS.addAll(sweet);

        System.out.println("\n--- Sorted by Price Descending ---");
        for (SweetDTO dto : sweetDTOS) {
            System.out.println(dto);
        }

        System.out.println("\n\n5. Sort all elements by name and price in desc\n");
        Set<SweetDTO> sort = new TreeSet<>(Comparator.comparing(SweetDTO::getName).thenComparing(SweetDTO::getPrice).reversed());
        sort.addAll(sweet);
        System.out.println("sorted in desc order");

        for (SweetDTO sorted : sort){
            System.out.println(sorted);
        }
        System.out.println("\n6. Convert set into linkedList\n");
        List<SweetDTO> list = new LinkedList<>(sweet);
        //list.forEach(System.out::println);
        for (SweetDTO listed : list){
            System.out.println(listed);
        }
    }
}
