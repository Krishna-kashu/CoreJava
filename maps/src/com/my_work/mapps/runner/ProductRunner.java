package com.my_work.mapps.runner;

import com.my_work.mapps.dto.ProductDTO;
import com.my_work.mapps.dto.VendorDTO;

import java.util.HashMap;
import java.util.Map;

public class ProductRunner {
    public static void main(String[] args) {
        Map<ProductDTO, VendorDTO> productVendorMap = new HashMap<>();

        productVendorMap.put(new ProductDTO("Laptop", "Electronics", 50000, "M123", 1),
                new VendorDTO("Lenovo", "GST1234", "2000"));

        productVendorMap.put(new ProductDTO("Phone", "Electronics", 25000, "M456", 2),
                new VendorDTO("Samsung", "GST5678", "1995"));

        productVendorMap.put(new ProductDTO("Laptop", "Electronics", 50000, "M123", 1),
                new VendorDTO("Lenovo", "GST1234", "2000"));

        productVendorMap.put(new ProductDTO("Phone", "Electronics", 25000, "M456", 2),
                new VendorDTO("Samsung", "GST5678", "1995"));

        productVendorMap.put(new ProductDTO("Tablet", "Electronics", 30000, "M789", 3),
                new VendorDTO("Apple", "GST9012", "1976"));
        productVendorMap.put(new ProductDTO("Smartwatch", "Wearables", 10000, "M321", 4),
                new VendorDTO("Fitbit", "GST3456", "2007"));
        productVendorMap.put(new ProductDTO("Monitor", "Electronics", 15000, "M654", 5),
                new VendorDTO("LG", "GST7890", "1958"));
        productVendorMap.put(new ProductDTO("Printer", "Peripherals", 8000, "M987", 6),
                new VendorDTO("HP", "GST2345", "1939"));
        productVendorMap.put(new ProductDTO("Router", "Networking", 5000, "M111", 7),
                new VendorDTO("TP-Link", "GST6789", "1996"));
        productVendorMap.put(new ProductDTO("Keyboard", "Accessories", 1500, "M222", 8),
                new VendorDTO("Logitech", "GST1357", "1981"));
        productVendorMap.put(new ProductDTO("Mouse", "Accessories", 1000, "M333", 9),
                new VendorDTO("Dell", "GST2468", "1984"));
        productVendorMap.put(new ProductDTO("TV", "Electronics", 40000, "M444", 10),
                new VendorDTO("Sony", "GST1122", "1946"));

        productVendorMap.put(new ProductDTO("Camera", "Photography", 55000, "M555", 11),
                new VendorDTO("Canon", "GST3344", "1937"));
        productVendorMap.put(new ProductDTO("Speaker", "Audio", 3500, "M666", 12),
                new VendorDTO("JBL", "GST5566", "1946"));
        productVendorMap.put(new ProductDTO("Headphones", "Audio", 2500, "M777", 13),
                new VendorDTO("Sony", "GST7788", "1946"));
        productVendorMap.put(new ProductDTO("Drone", "Electronics", 60000, "M888", 14),
                new VendorDTO("DJI", "GST9900", "2006"));
        productVendorMap.put(new ProductDTO("Projector", "Electronics", 30000, "M999", 15),
                new VendorDTO("BenQ", "GST1111", "2001"));
        productVendorMap.put(new ProductDTO("Scanner", "Peripherals", 9000, "M101", 16),
                new VendorDTO("Epson", "GST2222", "1942"));
        productVendorMap.put(new ProductDTO("SSD", "Storage", 4500, "M202", 17),
                new VendorDTO("Western Digital", "GST3333", "1970"));

        productVendorMap.put(new ProductDTO("Hard Drive", "Storage", 3500, "M303", 18),
                new VendorDTO("Seagate", "GST4444", "1979"));

        productVendorMap.put(new ProductDTO("Graphics Card", "Components", 25000, "M404", 19),
                new VendorDTO("NVIDIA", "GST5555", "1993"));

        productVendorMap.put(new ProductDTO("Motherboard", "Components", 10000, "M505", 20),
                new VendorDTO("ASUS", "GST6666", "1989"));

        productVendorMap.put(new ProductDTO("Hard Drive", "Storage", 3500, "M303", 18),
                new VendorDTO("Seagate", "GST4444", "1979"));

        productVendorMap.put(new ProductDTO("Graphics Card", "Components", 25000, "M404", 19),
                new VendorDTO("NVIDIA", "GST5555", "1993"));

        productVendorMap.put(new ProductDTO("Motherboard", "Components", 10000, "M505", 20),
                new VendorDTO("ASUS", "GST6666", "1989"));

        System.out.println("Keys:");
        productVendorMap.keySet().forEach(System.out::println);

        System.out.println("\nValues:");
        productVendorMap.values().forEach(System.out::println);

        System.out.println("\n\n");
        productVendorMap.entrySet().forEach(productDTOVendorDTOEntry ->
                System.out.println(productDTOVendorDTOEntry.getKey().getId()+" - "+
                        productDTOVendorDTOEntry.getKey().getName()+" - "+productDTOVendorDTOEntry.
                        getValue().getName()+productDTOVendorDTOEntry.getValue().getGstNo()));
    }
}
