package com.my_work.mapps.runner;

import com.my_work.mapps.dto.BrandDTO;
import com.my_work.mapps.dto.ComputerDTO;

import java.util.HashMap;
import java.util.Map;

public class ComputerRunner {
    public static void main(String[] args) {

    ComputerDTO c1 = new ComputerDTO("Inspiron", "Intel i5", 8, 512, "C001");
    ComputerDTO c2 = new ComputerDTO("MacBook Pro", "M2", 16, 512, "C002");
    ComputerDTO c3 = new ComputerDTO("ThinkPad", "Intel i7", 16, 1024, "C003");
    ComputerDTO c4 = new ComputerDTO("Pavilion", "AMD Ryzen 5", 8, 256, "C004");
    ComputerDTO c5 = new ComputerDTO("ROG", "Intel i9", 32, 1024, "C005");

    ComputerDTO c6 = new ComputerDTO("Acer Aspire", "Intel i3", 4, 512, "C006");
    ComputerDTO c7 = new ComputerDTO("Surface Laptop", "Intel i5", 16, 256, "C007");
    ComputerDTO c8 = new ComputerDTO("Chromebook", "Intel Celeron", 4, 128, "C008");
    ComputerDTO c9 = new ComputerDTO("Alienware", "Intel i9", 64, 2048, "C009");
    ComputerDTO c10 = new ComputerDTO("Legion", "AMD Ryzen 7", 16, 1024, "C010");

    ComputerDTO c11 = new ComputerDTO("Predator", "Intel i7", 32, 1024, "C011");
    ComputerDTO c12 = new ComputerDTO("Envy", "Intel i5", 8, 512, "C012");
    ComputerDTO c13 = new ComputerDTO("XPS", "Intel i9", 32, 1024, "C013");
    ComputerDTO c14 = new ComputerDTO("EliteBook", "Intel i7", 16, 512, "C014");
    ComputerDTO c15 = new ComputerDTO("IdeaPad", "AMD Ryzen 5", 8, 512, "C015");

    ComputerDTO c16 = new ComputerDTO("Omen", "Intel i7", 16, 1024, "C016");
    ComputerDTO c17 = new ComputerDTO("MacBook Air", "M1", 8, 256, "C017");
    ComputerDTO c18 = new ComputerDTO("Vivobook", "Intel i5", 8, 512, "C018");
    ComputerDTO c19 = new ComputerDTO("ZenBook", "Intel i7", 16, 1024, "C019");
    ComputerDTO c20 = new ComputerDTO("Swift", "Intel i5", 8, 512, "C020");

    ComputerDTO c21 = new ComputerDTO("Latitude", "Intel i5", 8, 512, "C021");
    ComputerDTO c22 = new ComputerDTO("Yoga", "Intel i7", 16, 512, "C022");
    ComputerDTO c23 = new ComputerDTO("ProBook", "Intel i3", 4, 256, "C023");
    ComputerDTO c24 = new ComputerDTO("Gram", "Intel i7", 16, 1024, "C024");
    ComputerDTO c25 = new ComputerDTO("TUF Gaming", "AMD Ryzen 9", 32, 2048, "C025");

    ComputerDTO c21d = new ComputerDTO("Latitude", "Intel i5", 8, 512, "C021");
    ComputerDTO c22d = new ComputerDTO("Yoga", "Intel i7", 16, 512, "C022");
    ComputerDTO c23d = new ComputerDTO("ProBook", "Intel i3", 4, 256, "C028");
    ComputerDTO c24d = new ComputerDTO("Gram", "Intel i7", 16, 1024, "C024");
    ComputerDTO c25d = new ComputerDTO("TUF Gaming", "AMD Ryzen 9", 32, 2048, "C025");



    BrandDTO b1 = new BrandDTO("Dell", "USA", 1984);
    BrandDTO b2 = new BrandDTO("Apple", "USA", 1976);
    BrandDTO b3 = new BrandDTO("Lenovo", "China", 1984);
    BrandDTO b4 = new BrandDTO("HP", "USA", 1939);
    BrandDTO b5 = new BrandDTO("Asus", "Taiwan", 1989);

    BrandDTO b6 = new BrandDTO("Acer", "Taiwan", 1976);
    BrandDTO b7 = new BrandDTO("Microsoft", "USA", 1975);
    BrandDTO b8 = new BrandDTO("Google", "USA", 1998);
    BrandDTO b9 = new BrandDTO("Alienware", "USA", 1996);
    BrandDTO b10 = new BrandDTO("Lenovo Legion", "China", 2017);

    BrandDTO b11 = new BrandDTO("Acer Predator", "Taiwan", 2015);
    BrandDTO b12 = new BrandDTO("HP Envy", "USA", 2009);
    BrandDTO b13 = new BrandDTO("Dell XPS", "USA", 2007);
    BrandDTO b14 = new BrandDTO("HP Elite", "USA", 2008);
    BrandDTO b15 = new BrandDTO("Lenovo Idea", "China", 2010);

    BrandDTO b16 = new BrandDTO("HP Omen", "USA", 2016);
    BrandDTO b17 = new BrandDTO("Apple", "USA", 1976);
    BrandDTO b18 = new BrandDTO("Asus", "Taiwan", 1989);
    BrandDTO b19 = new BrandDTO("Asus", "Taiwan", 1989);
    BrandDTO b20 = new BrandDTO("Acer Swift", "Taiwan", 2016);

    BrandDTO b21 = new BrandDTO("Dell Latitude", "USA", 1994);
    BrandDTO b22 = new BrandDTO("Lenovo Yoga", "China", 2012);
    BrandDTO b23 = new BrandDTO("HP ProBook", "USA", 2009);
    BrandDTO b24 = new BrandDTO("LG", "South Korea", 1958);
    BrandDTO b25 = new BrandDTO("Asus TUF", "Taiwan", 2018);

    Map<ComputerDTO, BrandDTO> computerBrandMap = new HashMap<>();

    computerBrandMap.put(c1, b1);
    computerBrandMap.put(c2, b2);
    computerBrandMap.put(c3, b3);
    computerBrandMap.put(c4, b4);
    computerBrandMap.put(c5, b5);
    computerBrandMap.put(c6, b6);
    computerBrandMap.put(c7, b7);
    computerBrandMap.put(c8, b8);
    computerBrandMap.put(c9, b9);
    computerBrandMap.put(c10, b10);
    computerBrandMap.put(c11, b11);
    computerBrandMap.put(c12, b12);
    computerBrandMap.put(c13, b13);
    computerBrandMap.put(c14, b14);
    computerBrandMap.put(c15, b15);
    computerBrandMap.put(c16, b16);
    computerBrandMap.put(c17, b17);
    computerBrandMap.put(c18, b18);
    computerBrandMap.put(c19, b19);
    computerBrandMap.put(c20, b20);
    computerBrandMap.put(c21, b21);
    computerBrandMap.put(c22, b22);
    computerBrandMap.put(c23, b23);
    computerBrandMap.put(c24, b24);
    computerBrandMap.put(c25, b25);
    computerBrandMap.put(c21d, b21);
    computerBrandMap.put(c22d, b22);
    computerBrandMap.put(c23d, b23);
    computerBrandMap.put(c24d, b24);
    computerBrandMap.put(c25d, b25);

    System.out.println("Keys:");
    computerBrandMap.keySet().forEach(System.out::println);

    System.out.println("Values:");
    computerBrandMap.values().forEach(System.out::println);

    System.out.println("\nEntries:");
    computerBrandMap.entrySet().forEach(entry -> {
        System.out.println(entry.getKey().getName() + " - " +
                entry.getKey().getProcessor() + " → " +
                entry.getValue().getName() + " (" +
                entry.getValue().getOriginCountry() + ")");
    });
}
}